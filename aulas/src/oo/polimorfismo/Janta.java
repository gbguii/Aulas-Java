package oo.polimorfismo;

public class Janta {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa("Carlos" ,99.55);
		Feijao feijao = new Feijao("Feijao" ,0.2);
		Arroz arroz = new Arroz("Arroz" ,0.1);
		Sorvete sorvete = new Sorvete("Sorvete" ,0.2);
		
		convidado.comer(feijao);
		convidado.comer(arroz);
		convidado.comer(sorvete);
		System.out.println(convidado);
	}

}
