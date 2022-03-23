package controle;

import java.util.Scanner;

public class ForWhile {

	public static void main(String[] args) {
		// fazer uma tabuada com for e while
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero para a tabuada: ");
		int tabuada = sc.nextInt();
		
		for(int i = 0; i<=10; i++) {
			int conta = i * tabuada;
			System.out.printf("%d x %d = % d%n", tabuada, i, conta);
		}
		
		System.out.println("------------------");
		
		
		int i2 = 0;
		while(i2 <= 10){
			int conta = i2 * tabuada;
			System.out.printf("%d x %d = % d%n", tabuada, i2, conta);
			i2++;
		}
		
		sc.close();
	}

}
