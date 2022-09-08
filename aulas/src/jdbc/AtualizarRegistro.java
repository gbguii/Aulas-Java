package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarRegistro {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Registros vigentes atualmente: ");
		// Cria conexão.
		Connection conexao = FabricaConexao.getConection();
		// String da query de consulta.
		String sql = "SELECT * FROM pessoas LIMIT 20";
		// Cria uma declaração de query.
		Statement stmt = conexao.createStatement();
		// Recupera a consulta da query
		ResultSet resultado = stmt.executeQuery(sql);
		// Cria um lista que recepera os valores da consulta para o formato objeto.
		List<Pessoa> pessoas = new ArrayList<>();
		// Itera pelo resultado.
		while(resultado.next()) {
			// Recupera o codigo informando qual a coluna.
			int codigo = resultado.getInt("codigo");
			// Recupera o nome informando qual a coluna.
			String nome = resultado.getString("nome");
			// Adiciona a lista no formato objeto de pessoa;
			pessoas.add(new Pessoa(codigo, nome));
		}
		// Percorre a lista
		for(Pessoa p : pessoas) {
		// Mostra o codigo e nome do objeto.
		System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		// Cria query de update.
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		// Cria a declaração de query.
		PreparedStatement stmt2 = conexao.prepareStatement(sqlUpdate);

		System.out.print("Selecione pelo ID: ");
		// Recupera o codigo do registro.
		int codigo = sc.nextInt();
		sc.nextLine();
		System.out.print("\nQual o novo nome? ");
		// Recupera o novo nome para atualização.
		String novoNome = sc.nextLine();
		
		// Define o parametro de codigo.
		stmt2.setInt(2, codigo);
		// Define o parametro para nome.
		stmt2.setString(1, novoNome);
		// Executa a atualização.
		stmt2.execute();
		// Informa ao usuário.
		System.out.println("Atualizado com sucesso!");
		
		// Fecha a declaração.
		stmt.close();
		// Fecha a declaração.
		stmt2.close();
		// Fecha a conexão.
		conexao.close();
		sc.close();
	}
}
