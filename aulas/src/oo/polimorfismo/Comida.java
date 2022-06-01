package oo.polimorfismo;

public abstract class Comida {
	String nome;
	double peso;
	
	public Comida(String nome, double peso){
		setNome(nome);
		setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
