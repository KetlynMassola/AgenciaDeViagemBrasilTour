package br.org.recodepro.brasiltour;

import java.util.List;
import java.util.Scanner;

import br.org.recodepro.brasiltour.dao.PassagemDAO;
import br.org.recodepro.brasiltour.modelo.Passagem;

public class PassagemMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PassagemDAO passagemDAO = new PassagemDAO();

		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Criar uma nova Passagem");
			System.out.println("2. Visualizar uma Passagem");
			System.out.println("3. Atualizar uma Passagem");
			System.out.println("4. Deletar uma Passagem");
			System.out.println("5. Listar todas as Passagens");
			System.out.println("0. Sair");

			System.out.print("Escolha uma opção: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro.

			switch (choice) {
			case 1:
				// Criar uma nova Passagem
				Passagem novaPassagem = new Passagem();
				System.out.print("Origem: ");
				novaPassagem.setOrigem(scanner.nextLine());
				System.out.print("Destino: ");
				novaPassagem.setDestino(scanner.nextLine());
				System.out.print("Data de Ida: ");
				novaPassagem.setDataIda(scanner.nextLine());
				System.out.print("Data de Volta: ");
				novaPassagem.setDataVolta(scanner.nextLine());
				System.out.print("Número do Pedido: ");
				novaPassagem.setNumPedido(scanner.nextInt());

				passagemDAO.create(novaPassagem);
				System.out.println("Passagem criada com sucesso.");
				break;

			case 2:
				// Visualizar uma Passagem
				System.out.print("Digite o número da Passagem: ");
				int numPassagem = scanner.nextInt();
				Passagem passagem = passagemDAO.readByNum(numPassagem);
				if (passagem.getNumPassagem() != null) {
					System.out.println("Número da Passagem: " + passagem.getNumPassagem());
					System.out.println("Origem: " + passagem.getOrigem());
					System.out.println("Destino: " + passagem.getDestino());
					System.out.println("Data de Ida: " + passagem.getDataIda());
					System.out.println("Data de Volta: " + passagem.getDataVolta());
					System.out.println("Número do Pedido: " + passagem.getNumPedido());
				} else {
					System.out.println("Passagem não encontrada.");
				}
				break;

			case 3:
				// Atualizar uma Passagem
				System.out.print("Digite o número da Passagem a ser atualizada: ");
				int numPassagemAtualizar = scanner.nextInt();
				Passagem passagemAtualizar = passagemDAO.readByNum(numPassagemAtualizar);

				if (passagemAtualizar.getNumPassagem() != null) {
					System.out.print("Nova origem: ");
					passagemAtualizar.setOrigem(scanner.nextLine());
					System.out.print("Novo destino: ");
					passagemAtualizar.setDestino(scanner.nextLine());
					System.out.print("Nova data de Ida: ");
					passagemAtualizar.setDataIda(scanner.nextLine());
					System.out.print("Nova data de Volta: ");
					passagemAtualizar.setDataVolta(scanner.nextLine());
					System.out.print("Novo número do Pedido: ");
					passagemAtualizar.setNumPedido(scanner.nextInt());

					passagemDAO.update(passagemAtualizar);
					System.out.println("Passagem atualizada com sucesso.");
				} else {
					System.out.println("Passagem não encontrada.");
				}
				break;

			case 4:
				// Deletar uma Passagem
				System.out.print("Digite o número da Passagem a ser deletada: ");
				int numPassagemDeletar = scanner.nextInt();
				Passagem passagemDeletar = passagemDAO.readByNum(numPassagemDeletar);

				if (passagemDeletar.getNumPassagem() != null) {
					passagemDAO.delete(numPassagemDeletar);
					System.out.println("Passagem deletada com sucesso.");
				} else {
					System.out.println("Passagem não encontrada.");
				}
				break;

			case 5:
				// Listar todas as Passagens
				List<Passagem> todasPassagens = passagemDAO.readAll();
				if (!todasPassagens.isEmpty()) {
					System.out.println("Todas as Passagens:");
					for (Passagem p : todasPassagens) {
						System.out.println("Número da Passagem: " + p.getNumPassagem());
						System.out.println("Origem: " + p.getOrigem());
						System.out.println("Destino: " + p.getDestino());
						System.out.println("Data de Ida: " + p.getDataIda());
						System.out.println("Data de Volta: " + p.getDataVolta());
						System.out.println("Número do Pedido: " + p.getNumPedido());
						System.out.println("-----------------------------");
					}
				} else {
					System.out.println("Nenhuma Passagem encontrada.");
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
