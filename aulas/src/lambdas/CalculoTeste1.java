package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		Calculo multiplicacao = new Multiplicar();
		
		System.out.println(soma.executar(3, 5));
		System.out.println(multiplicacao.executar(3, 5));
	}	

}
