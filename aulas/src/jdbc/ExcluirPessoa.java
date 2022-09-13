package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = sc.nextInt();
		
		
		
		Connection conexao = FabricaConexao.getConection();
		String sql = "DELET FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		int contador = stmt.executeUpdate();
		if(contador > 0) {
			System.out.println("Pesoa excluída com sucesso!");
		}else {
			System.out.println("Não foi possível realizar a atualização.");
		}
		System.out.println("Linhas afetadas: "+ contador);
		conexao.close();
		sc.close();
	}
}
