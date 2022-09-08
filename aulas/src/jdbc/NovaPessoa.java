package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome");
		String nome = entrada.nextLine();
		// Cria conexao com o banco de dados
		Connection conexao = FabricaConexao.getConection();
		// Query para adicionar valores
		String sql = "INSERT INTO pessoas(nome) VALUES (?)";
		// Cria um preparação para executar a query, passando a query como parametro.
		PreparedStatement stmt = conexao.prepareStatement(sql);
		// Define o valor que será inserido na chave "?".
		stmt.setString(1, nome);
		// Executa a query.
		stmt.execute();
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}
