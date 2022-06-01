package oo.composicao.PrimeiroDesafio;

public class Item {
	Produto produto;
	int quantidade;
	
	/**
	 * Construtor
	 * @param p Objeto do tipo Produto.
	 * @param qtde quantidade itens.
	 */
	Item(Produto p, int qtde){
		this.produto = p;
		this.quantidade = qtde;
	}

}
