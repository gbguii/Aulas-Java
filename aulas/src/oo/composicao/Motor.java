package oo.composicao;

public class Motor {
	/** define se o motor est� ligado. */
	boolean ligado = false;
	/** define o fator de inje��o do motor. */
	double fatorInjecao = 1;
	
	/**
	 * faz o calculo da quantidade de giros do motor.
	 * @return calculo da quantidade de giros do motor.
	 */
	int giros() {
		/** verifica se o motor est� ligado */
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
			}
	}
	
}
