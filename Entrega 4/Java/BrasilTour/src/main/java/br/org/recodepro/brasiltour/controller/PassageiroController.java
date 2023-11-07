package br.org.recodepro.brasiltour.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.recodepro.brasiltour.dao.PassageiroDAO;
import br.org.recodepro.brasiltour.modelo.Passageiro;

@WebServlet("/passageiros")
public class PassageiroController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PassageiroDAO dao = new PassageiroDAO();

		List<Passageiro> listaDePassageiros = dao.readAll();

		// enviar para a página certa
		request.setAttribute("passageiros", listaDePassageiros);

		request.getRequestDispatcher("/list_passageiros.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("delete") != null) {
			doDelete(request, response);
		} else {
			// Recupere os dados do formulário
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String telefone = request.getParameter("telefone");
			String email = request.getParameter("email");

			// Faça o processamento necessário com os dados (por exemplo, armazene-os no
			// banco de dados)...
			Passageiro passageiro = new Passageiro();
			passageiro.setNome(nome);
			passageiro.setCpf(cpf);
			passageiro.setTelefone(telefone);
			passageiro.setEmail(email);

			PassageiroDAO dao = new PassageiroDAO();

			// cadastrando
			dao.create(passageiro);

			// Armazene a mensagem de alerta em um atributo de sessão
			String alerta = "Cadastro realizado com sucesso!";

			// Redirecione o usuário para a página de exibição do alerta
			response.sendRedirect(request.getContextPath() + "/cad_passageiro.jsp?alerta=" + URLEncoder.encode(alerta, "UTF-8"));
		}
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("deletando");
		String cpfToDelete = request.getParameter("delete");
		if (cpfToDelete  != null) {
			PassageiroDAO dao = new PassageiroDAO();
			dao.delete(cpfToDelete);
			
			String alerta = "Cadastro excluído com sucesso! CPF: " + cpfToDelete;
			response.sendRedirect(request.getContextPath() + "/passageiros?alerta=" + URLEncoder.encode(alerta, "UTF-8"));
		} else {
			response.sendRedirect(request.getContextPath() + "/passageiros");
		}
	}
}
