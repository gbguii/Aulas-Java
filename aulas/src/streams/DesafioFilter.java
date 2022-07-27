package streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		Produto p1 = 
				new Produto("Cerveja", 4.99, new Date(2023-1900, 4, 10));
		Produto p2 = 
				new Produto("Sabão", 10.99, new Date(2023-1900, 6, 2));
		Produto p3 = 
				new Produto("Fermento", 6.99, new Date(2022-1900, 7, 24));
		Produto p4 = 
				new Produto("Arroz", 16.00, new Date(2023-1900, 10, 22));
		Produto p5 = 
				new Produto("Detergente", 2.50, new Date(2024-1900, 2, 15));
		Produto p6 = 
				new Produto("Chocolate", 8.79, new Date(2022-1900, 1, 1));
		Produto p7 = 
				new Produto("Coca-Cola", 7.50, new Date(2021-1900, 8, 30));
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> naoVencido = p -> p.validade.after(new Date());
		Predicate<Produto> valorProduto = 
				p -> p.preco >= 10.99;
		Function<Produto, String> produtosValidos = 
				p -> "Os produtos validos são " + p.name;
		produtos.stream()
			.filter(naoVencido)
			.filter(valorProduto)
			.map(produtosValidos)
			.forEach(System.out::println);
	}

}
