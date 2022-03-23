package controle;

import java.util.Scanner;

public class IF { 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a média: ");
		double media = entrada.nextDouble();
		
		if(media > 10 || media < 0) {
			System.out.println("Nota inválida.");
		}else if(media > 8.5) {
			if(media < 9.0) {
				System.out.println("A-");
			}else if(media >=9.0 && media < 9.5) {
				System.out.println("A");
			}else {
				System.out.println("A+");
			}
		}
		
		
		entrada.close();
	}
}
