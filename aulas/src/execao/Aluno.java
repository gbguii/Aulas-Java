package execao;

public class Aluno {
	public final String nome;
	public final Double nota;
	public final boolean bomComportamento;
	
	public Aluno(String nome, Double nota){
		this(nome, nota, true);
	}
	
	public Aluno(String nome, Double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	public String toString() {
		return nome + " tem nota " + nota;
	}
}
