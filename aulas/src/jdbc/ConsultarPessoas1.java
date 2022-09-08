package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException{
		// Cria conexão.
		Connection conexao = FabricaConexao.getConection();
		// String da query de consulta.
		String sql = "SELECT * FROM pessoas";
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
		// Fecha a declaração.
		stmt.close();
		// Fecha a conexão.
		conexao.close();
	}
}
