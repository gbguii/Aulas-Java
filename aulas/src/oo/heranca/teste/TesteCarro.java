package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		Civic civic = new Civic(180);
		Ferrari ferrari = new Ferrari(270);
		
		System.out.println("A velocidade atual do Civic � =>"+civic.velocidadeAtual);
		System.out.println("A velocidade atual da Ferrai � =>"+ferrari.velocidadeAtual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("A velocidade atual do Civic � =>"+civic.velocidadeAtual);
		System.out.println("A velocidade atual da Ferrai � =>"+ferrari.velocidadeAtual);
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		civic.frear();
		civic.frear();
		civic.frear();

		System.out.println("A velocidade atual do Civic � =>"+civic.velocidadeAtual);
		System.out.println("A velocidade atual da Ferrai � =>"+ferrari.velocidadeAtual);
	}
	

}
