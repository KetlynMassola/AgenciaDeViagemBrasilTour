package br.org.recodepro.brasiltour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.recodepro.brasiltour.modelo.Pedido;

public class PedidoDAO {

	public void create(Pedido pedido) {

		String sql = "INSERT INTO Pedido (Data_pedido, Forma_pgto, Valor_pgto, CPF_passageiro) VALUES (?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, pedido.getDataPedido());
			pstm.setString(2, pedido.getFormaPgto());
			pstm.setDouble(3, pedido.getValorPgto());
			pstm.setString(4, pedido.getCpfPassageiro());

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

	public List<Pedido> readAll() {
		String sql = "SELECT * FROM Pedido";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		// Lista de pedidos vazia
		List<Pedido> listaDePedidos = new ArrayList<>();

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();

			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				// Cada pedido encontrado no BD vai entrar aqui
				Pedido pedido = new Pedido();
				pedido.setNumPedido(rset.getInt("Num_pedido"));
				pedido.setDataPedido(rset.getString("Data_pedido"));
				pedido.setFormaPgto(rset.getString("Forma_pgto"));
				pedido.setValorPgto(rset.getDouble("Valor_pgto"));
				pedido.setCpfPassageiro(rset.getString("CPF_passageiro"));

				listaDePedidos.add(pedido);
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

		return listaDePedidos;
	}

	public Pedido readByNum(Integer numPedido) {
		Pedido pedido = new Pedido();
		String sql = "SELECT * FROM Pedido WHERE Num_pedido = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, numPedido);
			rset = pstm.executeQuery();

			if (rset.next()) {
				pedido.setNumPedido(rset.getInt("Num_pedido"));
				pedido.setDataPedido(rset.getString("Data_pedido"));
				pedido.setFormaPgto(rset.getString("Forma_pgto"));
				pedido.setValorPgto(rset.getDouble("Valor_pgto"));
				pedido.setCpfPassageiro(rset.getString("CPF_passageiro"));
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

		return pedido;
	}

	public void update(Pedido pedido) {
		String sql = "UPDATE Pedido SET Num_pedido = ?, Data_pedido = ?, Forma_pgto = ?, Valor_pgto = ?, CPF_passageiro = ? WHERE Num_pedido = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, pedido.getNumPedido());
			pstm.setString(2, pedido.getDataPedido());
			pstm.setString(3, pedido.getFormaPgto());
			pstm.setDouble(4, pedido.getValorPgto());
			pstm.setString(5, pedido.getCpfPassageiro());
			pstm.setInt(6, pedido.getNumPedido()); // Where

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
	public void delete(Integer numPedido) {
		String sql = "DELETE FROM Pedido WHERE Num_pedido = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			ConectarDB conectarDb = new ConectarDB();
			conn = conectarDb.conectar();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, numPedido);
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
