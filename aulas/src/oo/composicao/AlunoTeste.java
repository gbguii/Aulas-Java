package oo.composicao;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Guilherme");
		Aluno aluno2 = new Aluno("Gabriele");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso java = new Curso("Java");
		Curso javaScript = new Curso("JavaScript");
		Curso HTML = new Curso("HTML");
		
		java.addicionarAluno(aluno1);
		java.addicionarAluno(aluno2);
		
		javaScript.addicionarAluno(aluno1);
		javaScript.addicionarAluno(aluno3);
		
		HTML.addicionarAluno(aluno1);
		HTML.addicionarAluno(aluno2);
		
		System.out.println(aluno1.cursoDoAluno(aluno2));
		Curso cursoProcurado = aluno1.obterCursoPorNome("Java");
		
		if(cursoProcurado != null) {
			System.out.println(cursoProcurado.nome);
			System.out.println(cursoProcurado.alunos);
		}
	}

}
