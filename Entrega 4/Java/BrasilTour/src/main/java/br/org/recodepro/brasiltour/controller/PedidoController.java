package br.org.recodepro.brasiltour.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.recodepro.brasiltour.dao.PedidoDAO;
import br.org.recodepro.brasiltour.modelo.Pedido;

@WebServlet("/pedidos")
public class PedidoController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PedidoDAO dao = new PedidoDAO();

		List<Pedido> listaDePedidos = dao.readAll();

		// enviar para a página certa
		request.setAttribute("pedidos", listaDePedidos);

		request.getRequestDispatcher("/list_pedidos.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("delete") != null) {
			// chamar o deletar
			doDelete(request, response);
		} else {
			System.out.println("Pedido recebido com sucesso");
	
			// data_viagem
			String dataViagem = request.getParameter("data_viagem");
			String formaPgto = request.getParameter("forma_pgto");
			String valorPgto = request.getParameter("valor_pgto");
			Double valorPgtoDouble = Double.parseDouble(valorPgto); // converter String para Double
			String cpfPassageiro = request.getParameter("cpf_passageiro");
	
			Pedido pedido = new Pedido();
			pedido.setDataPedido(dataViagem);
			pedido.setFormaPgto(formaPgto);
			pedido.setValorPgto(valorPgtoDouble);
			pedido.setCpfPassageiro(cpfPassageiro);
	
			// salvar no PedidoDAO.create
			PedidoDAO dao = new PedidoDAO();
			dao.create(pedido);
	
			// Armazene a mensagem de alerta em um atributo de sessão
			String alerta = "Cadastro realizado com sucesso!";
	
			// Redirecione o usuário para a página de exibição do alerta
			response.sendRedirect(request.getContextPath() + "/cad_pedido.jsp?alerta=" + URLEncoder.encode(alerta, "UTF-8"));
		}
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("deletando");
		String numPedido = request.getParameter("delete");
		if (numPedido != null) {
			PedidoDAO dao = new PedidoDAO();
			Integer numPedidoInteger = Integer.parseInt(numPedido);
			dao.delete(numPedidoInteger);
			
			String alerta = "Cadastro excluído com sucesso! Número: " + numPedidoInteger;
			response.sendRedirect(request.getContextPath() + "/pedidos?alerta=" + URLEncoder.encode(alerta, "UTF-8"));
		} else {
			response.sendRedirect(request.getContextPath() + "/pedidos");
		}
	}

}
