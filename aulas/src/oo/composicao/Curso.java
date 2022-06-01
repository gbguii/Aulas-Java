package oo.composicao;

import java.util.ArrayList;

public class Curso {
	
	String nome;
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	void addicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
}
