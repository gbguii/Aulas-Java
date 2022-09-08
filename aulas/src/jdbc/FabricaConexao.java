package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConection() {
		try {
			String StringDeConexao = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
			String usuario = "root";
			String senha = "lgbluiz1414";
			return DriverManager.getConnection(StringDeConexao, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
