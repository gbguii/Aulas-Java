package execao.personalizadaB;

import execao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		try {
			Aluno aluno1 = new Aluno("Ana", 7.2);
			Validar.aluno(aluno1);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
			
		} catch (NumeroForaIntervaloException |
				IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | 
				IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Sempre irá rodar o que tem no finally");
		}
		
		System.out.println("Fim :>"); 
	}
	
	
}
