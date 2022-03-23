package fundamentos;

import java.util.Scanner;

public class DesafioConverterStringNumero {

	public static void main(String[] args) {
		// Pegar 3 valores salários de Strings e converter para número.
		// Usuário pode digitar virgula ou ponto.
		// Mostrar a média dos salários.
 		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1° salário: ");
		String valor1 = sc.next();
		
		System.out.print("Digite o 2° salário: ");
		String valor2 = sc.next();
		
		System.out.print("Digite o 3° salário: ");
		String valor3 = sc.next();
		
		double salario1 =Double.parseDouble(valor1.replace(",", ".")); 
		double salario2 =Double.parseDouble(valor2.replace(",", ".")); 
		double salario3 =Double.parseDouble(valor3.replace(",", ".")); 
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("A média dos salários é igual a %.3f", media);
		
		sc.close();

	}

}
