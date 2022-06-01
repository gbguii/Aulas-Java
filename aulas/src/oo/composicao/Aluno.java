package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void addicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	String cursoDoAluno(Aluno aluno) {
		String result = "";
		for(Curso curso: aluno.cursos) {
			result += String.format("O aluno %s está no curso %s%n", aluno.nome, curso.nome);
		}
		return result;
	}
	
	Curso obterCursoPorNome(String nome) {
		Curso cursoProcurado = null;
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				cursoProcurado = curso;
			}
		}
		return cursoProcurado;
	}
	public String toString() {
		return nome;
	}
}
