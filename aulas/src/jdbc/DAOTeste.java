package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas(nome) VALUES(?)";
		System.out.println(dao.incluir(sql, "João Barbieri"));
		System.out.println(dao.incluir(sql, "Gabriel Silva"));
		System.out.println(dao.incluir(sql, "Agostinho Carrara"));

	}

}
