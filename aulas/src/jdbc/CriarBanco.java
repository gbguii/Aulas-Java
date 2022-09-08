package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		String StringDeConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "lgbluiz1414";
		
		Connection conexao = DriverManager.getConnection(StringDeConexao, usuario, senha);
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_2");
		stmt.execute("DROP DATABASE IF EXISTS curso_java_2");
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}

}
