package br.org.recodepro.brasiltour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.recodepro.brasiltour.modelo.Passageiro;

public class PassageiroDAO {

	// create
	public void create(Passageiro passageiro) {
		String sql = "INSERT INTO Passageiro (Nome, CPF, Telefone, Email) VALUES (?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passageiro.getNome());
			pstm.setString(2, passageiro.getCpf());
			pstm.setString(3, passageiro.getTelefone());
			pstm.setString(4, passageiro.getEmail());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// read all
	public List<Passageiro> readAll() {
		String sql = "SELECT * FROM Passageiro";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		// Lista de passageiros vazia
		List<Passageiro> listaDePassageiros = new ArrayList<>();

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();

			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				// Cada passageiro encontrado no BD vai entrar aqui
				Passageiro passageiro = new Passageiro();

				passageiro.setNome(rset.getString("Nome"));
				passageiro.setCpf(rset.getString("CPF"));
				passageiro.setTelefone(rset.getString("Telefone"));
				passageiro.setEmail(rset.getString("Email"));

				listaDePassageiros.add(passageiro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return listaDePassageiros;
	}

	// readById
	public Passageiro readByCPF(String CPF) {
		Passageiro passageiro = new Passageiro();
		String sql = "SELECT * FROM Passageiro WHERE CPF = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, CPF);
			rset = pstm.executeQuery();

			if (rset.next()) {
				passageiro.setCpf(rset.getString("CPF"));
				passageiro.setNome(rset.getString("Nome"));
				passageiro.setTelefone(rset.getString("Telefone"));
				passageiro.setEmail(rset.getString("Email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return passageiro;
	}

	// update
	public void update(Passageiro passageiro) {
		String sql = "UPDATE Passageiro SET Nome = ?, CPF = ?, Telefone = ?, Email = ? WHERE CPF = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passageiro.getNome());
			pstm.setString(2, passageiro.getCpf());
			pstm.setString(3, passageiro.getTelefone());
			pstm.setString(4, passageiro.getEmail());
			pstm.setString(5, passageiro.getCpf());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// delete
	public void delete(String CPF) {
		String sql = "DELETE FROM Passageiro WHERE CPF = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, CPF);
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
