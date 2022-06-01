package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Gui", "Bia", "Lia");
		
		System.out.println("Forma Tradicional");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01");
		aprovados.forEach((nomes) -> {System.out.println(nomes + " 123");});
		
		System.out.println("\nMethod Reference #1...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> meuNome(nome));
		
		System.out.println("\nMethod Reference #2...");
		aprovados.forEach(ForEach::meuNome);

	}
	static void meuNome(String nome) {
		System.out.println("Oi!! Meu nome é "+nome);
	}
}
