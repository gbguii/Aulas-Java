package oo.heranca.desafio;

public class Carro {
	public int velocidadeAtual = 0;
	protected final int VELOCIDADE_MAXIMA;
	private int delta =5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += 5;
		}
	}
	
	public void frear(){
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
