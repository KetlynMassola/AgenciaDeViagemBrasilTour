package br.org.recodepro.brasiltour.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.recodepro.brasiltour.dao.PassagemDAO;
import br.org.recodepro.brasiltour.modelo.Passagem;

@WebServlet("/passagens")
public class PassagemController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PassagemDAO dao = new PassagemDAO();

		List<Passagem> listaDePassgens = dao.readAll();

		// enviar para a página certa
		request.setAttribute("passagens", listaDePassgens);

		request.getRequestDispatcher("/list_passagens.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("delete") != null) {
			// chamar o deletar
			doDelete(request, response);
		} else {
			System.out.println("Compra aprovada com sucesso");

			// Dados para compra da passagem
			String origemViagem = request.getParameter("origem");
			String destinoViagem = request.getParameter("destino");
			String dataIda = request.getParameter("data_ida");
			String dataVolta = request.getParameter("data_volta");
			String numPedido = request.getParameter("num_pedido");
			Integer numPedidoInteger = Integer.parseInt(numPedido);

			Passagem passagem = new Passagem();
			passagem.setOrigem(origemViagem);
			passagem.setDestino(destinoViagem);
			passagem.setDataIda(dataIda);
			passagem.setDataVolta(dataVolta);
			passagem.setNumPedido(numPedidoInteger);

			// salvar no PassagemDAO.create
			PassagemDAO dao = new PassagemDAO();
			dao.create(passagem);

			// Armazene a mensagem de alerta em um atributo de sessão
			String alerta = "Cadastro realizado com sucesso!";

			// Redirecione o usuário para a página de exibição do alerta
			response.sendRedirect(
					request.getContextPath() + "/cad_passagem.jsp?alerta=" + URLEncoder.encode(alerta, "UTF-8"));
		}
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("deletando");
		String numPassagem = request.getParameter("delete");
		if (numPassagem != null) {
			PassagemDAO dao = new PassagemDAO();
			Integer numPassagemInteger = Integer.parseInt(numPassagem);
			dao.delete(numPassagemInteger);
			
			String alerta = "Cadastro excluído com sucesso! Número: " + numPassagemInteger;
			response.sendRedirect(request.getContextPath() + "/passagens?alerta=" + URLEncoder.encode(alerta, "UTF-8"));
		} else {
			response.sendRedirect(request.getContextPath() + "/passagens");
		}
	}

}
