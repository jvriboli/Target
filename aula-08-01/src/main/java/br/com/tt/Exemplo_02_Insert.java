package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo_02_Insert {
	private static final String URL = "jdbc:mysql://localhost:3306/aula";
	private static final String USER = "root";
	private static final String SENHA = "";

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(URL, USER, SENHA);
		String sql = "INSERT INTO cliente (nome, cnpj_cpf)values (?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "Carlos");
		pstmt.setString(2, "00000000000");
		pstmt.execute();

	}

}
