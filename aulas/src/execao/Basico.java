package execao;

public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;
		try {
			imprimirNomeAluno(a1);
		} catch (Exception ex) {
			System.out.println("Ocorreu um erro ao imprimir o nome.");
		}
		try {
			System.out.println(7/0);
		} catch (ArithmeticException ex) {
			System.out.println("Ocorreu o erro: "+ ex.getMessage());
			
		}
	}
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
