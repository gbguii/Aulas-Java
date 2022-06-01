package oo.composicao.PrimeiroDesafio;

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Guilherme");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		compra1.addItens("Caneta", 3.0, 3);
		compra1.addItens("Caderno", 20.0, 3);
		
		compra2.addItens("Borracha", 1.50, 1);
		compra2.addItens("TV", 1000, 1);
		
		cliente1.addCompra(compra1);
		cliente1.addCompra(compra2);
		System.out.println(cliente1.obterValorTotal());
	}
}
