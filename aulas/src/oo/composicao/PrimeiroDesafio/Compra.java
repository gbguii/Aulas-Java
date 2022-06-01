package oo.composicao.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	/**
	 * M�tdo para adicionar itens ao Array.
	 * @param p Objeto do tipo Produto.
	 * @param qtde n�mero de itens
	 */
	void addItens(Produto p, int qtde) {
		itens.add(new Item(p, qtde));
	}
	
	/**
	 * M�todo para adicionar itens ao array sem precisar passar um objeto do tipo Produto.
	 * @param nome Nome que ser� dado ao Produto.
	 * @param preco Pre�o que ser� dado ao Produto.
	 * @param qtde N�mero de itens.
	 */
	void addItens(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		itens.add(new Item(produto, qtde));
	}
	
	/**
	 * M�todo para calcular o valor total da compra.
	 * @return o valor total da compra.
	 */
	double obterValorTotal() {
		double resultado = 0;
		for(Item item: itens) {
			resultado += item.quantidade * item.produto.preco;
		}
		return resultado;
	}
}
