package br.org.recodepro.brasiltour;

import java.util.List;
import java.util.Scanner;

import br.org.recodepro.brasiltour.dao.PedidoDAO;
import br.org.recodepro.brasiltour.modelo.Pedido;

public class PedidoMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PedidoDAO pedidoDAO = new PedidoDAO();

		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Inserir Pedido");
			System.out.println("2. Listar Todos os Pedidos");
			System.out.println("3. Buscar Pedido por Número");
			System.out.println("4. Atualizar Pedido");
			System.out.println("5. Deletar Pedido");
			System.out.println("0. Sair");

			System.out.print("Escolha uma opção: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro.

			switch (choice) {
			case 1:
				// Inserir Pedido
				Pedido novoPedido = new Pedido();
				System.out.print("Data do Pedido: ");
				novoPedido.setDataPedido(scanner.nextLine());
				System.out.print("Forma de Pagamento: ");
				novoPedido.setFormaPgto(scanner.nextLine());
				System.out.print("Valor do Pagamento: ");
				novoPedido.setValorPgto(scanner.nextDouble());
				scanner.nextLine(); // Consumir a quebra de linha após a leitura do double.
				System.out.print("CPF do Passageiro: ");
				novoPedido.setCpfPassageiro(scanner.nextLine());

				pedidoDAO.create(novoPedido);
				System.out.println("Pedido inserido com sucesso.");
				break;

			case 2:
				// Listar Todos os Pedidos
				List<Pedido> pedidos = pedidoDAO.readAll();
				for (Pedido p : pedidos) {
					System.out.println("Número do Pedido: " + p.getNumPedido());
					System.out.println("Data do Pedido: " + p.getDataPedido());
					System.out.println("Forma de Pagamento: " + p.getFormaPgto());
					System.out.println("Valor do Pagamento: " + p.getValorPgto());
					System.out.println("CPF do Passageiro: " + p.getCpfPassageiro());
					System.out.println();
				}
				break;

			case 3:
				// Buscar Pedido por Número
				System.out.print("Digite o Número do Pedido: ");
				int numPedido = scanner.nextInt();
				Pedido pedidoEncontrado = pedidoDAO.readByNum(numPedido);

				if (pedidoEncontrado.getNumPedido() != null) {
					System.out.println("Número do Pedido: " + pedidoEncontrado.getNumPedido());
					System.out.println("Data do Pedido: " + pedidoEncontrado.getDataPedido());
					System.out.println("Forma de Pagamento: " + pedidoEncontrado.getFormaPgto());
					System.out.println("Valor do Pagamento: " + pedidoEncontrado.getValorPgto());
					System.out.println("CPF do Passageiro: " + pedidoEncontrado.getCpfPassageiro());
				} else {
					System.out.println("Pedido não encontrado.");
				}
				break;

			case 4:
				// Atualizar Pedido
				System.out.print("Digite o Número do Pedido a ser atualizado: ");
				int numPedidoToUpdate = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro.
				Pedido pedidoToUpdate = pedidoDAO.readByNum(numPedidoToUpdate);

				if (pedidoToUpdate.getNumPedido() != null) {
					System.out.print("Nova Data do Pedido: ");
					pedidoToUpdate.setDataPedido(scanner.nextLine());
					System.out.print("Nova Forma de Pagamento: ");
					pedidoToUpdate.setFormaPgto(scanner.nextLine());
					System.out.print("Novo Valor do Pagamento: ");
					pedidoToUpdate.setValorPgto(scanner.nextDouble());
					scanner.nextLine(); // Consumir a quebra de linha após a leitura do double.
					System.out.print("Novo CPF do Passageiro: ");
					pedidoToUpdate.setCpfPassageiro(scanner.nextLine());

					pedidoDAO.update(pedidoToUpdate);
					System.out.println("Pedido atualizado com sucesso.");
				} else {
					System.out.println("Pedido não encontrado.");
				}
				break;

			case 5:
				// Deletar Pedido
				System.out.print("Digite o Número do Pedido a ser deletado: ");
				int numPedidoToDelete = scanner.nextInt();
				Pedido pedidoToDelete = pedidoDAO.readByNum(numPedidoToDelete);

				if (pedidoToDelete.getNumPedido() != null) {
					pedidoDAO.delete(numPedidoToDelete);
					System.out.println("Pedido deletado com sucesso.");
				} else {
					System.out.println("Pedido não encontrado.");
				}
				break;

			case 0:
				System.out.println("Encerrando o programa.");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (choice != 0);

		scanner.close();
	}
}
