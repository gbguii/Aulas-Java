package fundamentos;

import java.util.Scanner;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		String valor1 = sc.next();
		
		System.out.println("Digite um valor");
		String valor2 = sc.next();
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		
		System.out.printf("A soma dos valores é %.2f", soma);
		sc.close();
	}

}
