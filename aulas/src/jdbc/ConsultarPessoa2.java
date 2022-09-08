package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		System.out.println("Nome: ");
		String letras = sc.next();
		
		Connection conexao = FabricaConexao.getConection();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + letras + "%");
		
		List<Pessoa> pessoas = new ArrayList<>();
		ResultSet retorno =  stmt.executeQuery();
		while(retorno.next()) {
			int codigo = retorno.getInt("codigo");
			String nome = retorno.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		stmt.close();
		conexao.close();
		sc.close();
	}
}
