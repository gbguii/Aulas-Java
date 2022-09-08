package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException{
		String StringDeConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "lgbluiz1414";
		
		Connection conexao = DriverManager.getConnection(StringDeConexao, usuario, senha);
		System.out.println("Conexão realizada com sucesso!");
		conexao.close();
	}
}
