package oo.composicao;

public class Carro {
	Motor motor = new Motor();
	Porta leftDoorDriver = new Porta();
	Porta rightDoorRider = new Porta();

	/** m�todo para acelerar o motor. */
	void acelerar() {
		if (motor.fatorInjecao < 2.6 && portasFechadas()) {
			motor.fatorInjecao += 0.4;
		} else {
			motor.fatorInjecao = 1;
		}
	}

	/** m�todo para frear o motor. */
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	/** m�todo para ligar o motor. */
	void ligar() {
		motor.ligado = true;
	}

	/** m�todo para desligar o motor. */
	void desligar() {
		motor.ligado = false;
	}

	/** m�todo para verificar se o motor est� ligado. */
	boolean estaLigado() {
		return motor.ligado;
	}

	boolean portasFechadas() {
		return leftDoorDriver.closeDoor && rightDoorRider.closeDoor;
	}

	void fecharPortas() {
		leftDoorDriver.closeDoor = true;
		rightDoorRider.closeDoor = true;
	}

	void abrirPortas() {
		if (!portasFechadas()) {
			leftDoorDriver.closeDoor = false;
			rightDoorRider.closeDoor = false;
		}
	}
}
