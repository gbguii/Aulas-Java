package execao.personalizadaA;

import execao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		try {
			Aluno aluno1 = new Aluno("Ana", 7.2);
			Validar.aluno(aluno1);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException |
				IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim :>");
	}

}
