package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome+ " !!!");
		
		Produto p1 = new Produto("Caneta", 3.99, 0.0);
		Produto p2 = new Produto("Borracha", 2.50, 0.0);
		Produto p3 = new Produto("Caderno", 30.99, 0.15);
		Produto p4 = new Produto("Lapis", 1.99, 0.0);
		Produto p5 = new Produto("Giz de ceira", 18.99, 0.1);
		imprimirNome.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(prod -> System.out.println(prod.preco));
		produtos.forEach(System.out::println);
	}

}
