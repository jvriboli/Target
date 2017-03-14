package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplo_01_select {
	private static final String URL = "jdbc:mysql://localhost:3306/aula";
	private static final String USER = "root";
	private static final String SENHA = "";

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, SENHA);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM cliente";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cnpjCpf = rs.getString("cnpj_cpf");

				System.out.println(id + " - " + nome + " - " + cnpjCpf);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
