package br.org.recodepro.brasiltour.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarDB {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/brasil_tour";
	private String user = "root"; // usuário do bd
	private String password = ""; // senha do bd

	private Connection conn;

	public Connection conectar() {
		// Criando conexão do MySQL
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("Conectado!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return conn;
	}

}
