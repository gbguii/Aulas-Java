package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		resultadoConcurso.adicionar(1, "Gabriele");
		resultadoConcurso.adicionar(2, "João");
		resultadoConcurso.adicionar(3, "Pedro");
		resultadoConcurso.adicionar(4, "Santina");
		resultadoConcurso.adicionar(3, "Claudio");
		
		System.out.println(resultadoConcurso.getValor(2));
	}
}
