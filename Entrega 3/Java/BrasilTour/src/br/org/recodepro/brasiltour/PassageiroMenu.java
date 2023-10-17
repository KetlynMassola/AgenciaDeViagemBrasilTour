package br.org.recodepro.brasiltour;

import java.util.List;
import java.util.Scanner;

import br.org.recodepro.brasiltour.dao.PassageiroDAO;
import br.org.recodepro.brasiltour.modelo.Passageiro;

public class PassageiroMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PassageiroDAO passageiroDAO = new PassageiroDAO();

		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Inserir Passageiro");
			System.out.println("2. Listar Todos os Passageiros");
			System.out.println("3. Buscar Passageiro por CPF");
			System.out.println("4. Atualizar Passageiro");
			System.out.println("5. Deletar Passageiro");
			System.out.println("0. Sair");

			System.out.print("Escolha uma opção: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro.

			switch (choice) {
			case 1:
				// Inserir Passageiro
				Passageiro novoPassageiro = new Passageiro();
				System.out.print("Nome: ");
				novoPassageiro.setNome(scanner.nextLine());
				System.out.print("CPF: ");
				novoPassageiro.setCpf(scanner.nextLine());
				System.out.print("Telefone: ");
				novoPassageiro.setTelefone(scanner.nextLine());
				System.out.print("Email: ");
				novoPassageiro.setEmail(scanner.nextLine());

				passageiroDAO.create(novoPassageiro);
				System.out.println("Passageiro inserido com sucesso.");
				break;

			case 2:
				// Listar Todos os Passageiros
				List<Passageiro> passageiros = passageiroDAO.readAll();
				for (Passageiro p : passageiros) {
					System.out.println("Nome: " + p.getNome());
					System.out.println("CPF: " + p.getCpf());
					System.out.println("Telefone: " + p.getTelefone());
					System.out.println("Email: " + p.getEmail());
					System.out.println();
				}
				break;

			case 3:
				// Buscar Passageiro por CPF
				System.out.print("Digite o CPF: ");
				String cpf = scanner.nextLine();
				Passageiro passageiroEncontrado = passageiroDAO.readByCPF(cpf);
				if (passageiroEncontrado.getCpf() != null) {
					System.out.println("Nome: " + passageiroEncontrado.getNome());
					System.out.println("CPF: " + passageiroEncontrado.getCpf());
					System.out.println("Telefone: " + passageiroEncontrado.getTelefone());
					System.out.println("Email: " + passageiroEncontrado.getEmail());
				} else {
					System.out.println("Passageiro não encontrado.");
				}
				break;

			case 4:
				// Atualizar Passageiro
				System.out.print("Digite o CPF do Passageiro a ser atualizado: ");
				String cpfToUpdate = scanner.nextLine();
				Passageiro passageiroToUpdate = passageiroDAO.readByCPF(cpfToUpdate);

				if (passageiroToUpdate.getCpf() != null) {
					System.out.print("Novo Nome: ");
					passageiroToUpdate.setNome(scanner.nextLine());
					System.out.print("Novo CPF: ");
					passageiroToUpdate.setCpf(scanner.nextLine());
					System.out.print("Novo Telefone: ");
					passageiroToUpdate.setTelefone(scanner.nextLine());
					System.out.print("Novo Email: ");
					passageiroToUpdate.setEmail(scanner.nextLine());

					passageiroDAO.update(passageiroToUpdate);
					System.out.println("Passageiro atualizado com sucesso.");
				} else {
					System.out.println("Passageiro não encontrado.");
				}
				break;

			case 5:
				// Deletar Passageiro
				System.out.print("Digite o CPF do Passageiro a ser deletado: ");
				String cpfToDelete = scanner.nextLine();
				Passageiro passageiroToDelete = passageiroDAO.readByCPF(cpfToDelete);

				if (passageiroToDelete.getCpf() != null) {
					passageiroDAO.delete(cpfToDelete);
					System.out.println("Passageiro deletado com sucesso.");
				} else {
					System.out.println("Passageiro não encontrado.");
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
