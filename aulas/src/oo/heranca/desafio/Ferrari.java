package oo.heranca.desafio;

public class Ferrari extends Carro implements Turbo, ArCondicionado{
	private boolean turboLigado;
	private boolean arLigado;
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(getDelta());
	}
	@Override
	public void ligarTurbo() {
		turboLigado = true;
	}
	@Override
	public void desligarTurbo() {
		turboLigado =  false;
	}
	
	@Override
	public void ligarAr() {
		arLigado = true;
	}
	
	@Override
	public void desligarAr() {
		arLigado = false;
	}
	
	@Override
	public int getDelta() {
		if(turboLigado && !arLigado) {
			return 35;
		}else if(turboLigado && arLigado) {
			return 30;
		}else if(!turboLigado && !arLigado) {
			return 20;
		}else {
			return 15;
		}
	}

}
