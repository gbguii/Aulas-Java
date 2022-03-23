package fundamentos;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
		int cabeca1 = 6*(3+2);
		int expoCabeca1 = (int) Math.pow(cabeca1, 2);
		int diviCabeca1 = 3*2;
		
		int diviCabeca2 = 2;
		int cabeca2 =  (1-5)*(2-7) / diviCabeca2;
		int expoCabeca2 = (int) Math.pow(cabeca2, 2);
		
		int left = expoCabeca1 / diviCabeca1;
		int right = expoCabeca2;
		
		int subtracao = left - right;
		int expoTudo = (int) Math.pow(subtracao, 3);
		
		int diviTudo = (int) Math.pow(10, 3);
		
		int contaFinal = expoTudo / diviTudo;
		System.out.println(contaFinal);
		
		
		
		
	}

}
