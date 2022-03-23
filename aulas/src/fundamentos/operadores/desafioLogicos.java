package fundamentos.operadores;

public class desafioLogicos {

	public static void main(String[] args) {
		
		boolean JobTer = true;
		boolean JobQui = true;
		boolean iceCream = false;
		int tv;
		
		if(JobTer && JobQui) {
			iceCream = true;
			tv = 52;
		}else if(JobTer ^ JobQui) {
			iceCream = true;
			tv = 32;
		}else {
			iceCream = false;
			tv = 0;
		}
		
		System.out.printf("Trabalho na terça: %b%n", JobTer);
		System.out.printf("Trabalho na quinta: %b%n", JobQui);
		System.out.printf("Tomou sorvete: %b%n", iceCream);
		System.out.printf("Tamanho da tv: %d", tv);
		
	}

}
