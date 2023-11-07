package br.org.recodepro.brasiltour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.recodepro.brasiltour.modelo.Passagem;

public class PassagemDAO {

	// create
	public void create(Passagem passagem) {
		String sql = "INSERT INTO Passagem (Origem, Destino, Data_Ida, Data_Volta, Num_pedido) VALUES (?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passagem.getOrigem());
			pstm.setString(2, passagem.getDestino());
			pstm.setString(3, passagem.getDataIda());
			pstm.setString(4, passagem.getDataVolta());
			pstm.setInt(5, passagem.getNumPedido());

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
	public List<Passagem> readAll() {
		String sql = "SELECT * FROM Passagem";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		// Lista de passagem vazia
		List<Passagem> listaDePassagem = new ArrayList<>();

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();

			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				// Cada passagem encontrada no BD vai entrar aqui
				Passagem passagem = new Passagem();

				passagem.setNumPassagem(rset.getInt("Num_passagem")); // Num_passagem
				passagem.setOrigem(rset.getString("Origem"));
				passagem.setDestino(rset.getString("Destino"));
				passagem.setDataIda(rset.getString("Data_ida"));
				passagem.setDataVolta(rset.getString("Data_volta"));
				passagem.setNumPedido(rset.getInt("Num_pedido"));

				listaDePassagem.add(passagem);
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

		return listaDePassagem;
	}

	// readById
	public Passagem readByNum(Integer numPassagem) {

		Passagem passagem = new Passagem();
		String sql = "SELECT * FROM Passagem WHERE Num_passagem = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, numPassagem);
			rset = pstm.executeQuery();

			if (rset.next()) {
				passagem.setNumPassagem(rset.getInt("Num_passagem"));
				passagem.setOrigem(rset.getString("Origem"));
				passagem.setDestino(rset.getString("Destino"));
				passagem.setDataIda(rset.getString("Data_ida"));
				passagem.setDataVolta(rset.getString("Data_volta"));
				passagem.setNumPedido(rset.getInt("Num_pedido"));
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

		return passagem;
	}

	// update
	public void update(Passagem passagem) {
		String sql = "UPDATE Passagem SET Num_passagem= ?, Origem = ?, Destino = ?, Data_ida= ?  Data_volta = ? WHERE Num_pedido = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passagem.getOrigem());
			pstm.setString(2, passagem.getDestino());
			pstm.setString(3, passagem.getDataIda());
			pstm.setString(4, passagem.getDataVolta());
			pstm.setInt(5, passagem.getNumPedido());

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
	public void delete(Integer numPassagem) {
		String sql = "DELETE FROM Passagem WHERE Num_passagem = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, numPassagem);
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
