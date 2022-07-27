package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		/**
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. arredondar: deixar duas casas decimais
		 * 5. formatar: R$1234,56
		 */
		
		Function<Produto, Double> valorDesconto = prod -> 
			prod.preco - (prod.preco * prod.desconto);
			
		UnaryOperator<Double> valorImposto = valor -> 
		valor >= 2500? valor * 1.085 : valor;
		
		UnaryOperator<Double> valorFrete = valor -> 
			valor>= 3000? valor + 100 : valor + 50;
		
		Function<Double, String> arrendondador = valor -> String.format("%.2f", valor);
		
		UnaryOperator<String> formatador = valor -> String.format("R$%s", valor);
		
		String resultado = valorDesconto
				.andThen(valorImposto)
				.andThen(valorFrete)
				.andThen(arrendondador)
				.andThen(formatador)
				.apply(p);
		
		System.out.println(resultado);
	}

}
