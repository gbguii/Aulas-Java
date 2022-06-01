package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Luiz";
		c1.adicionarItem("Caneta", 7.45, 20);
		c1.adicionarItem("Borracha", 3.89, 12);
		c1.adicionarItem("Caderno", 18.70, 3);
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}

}
