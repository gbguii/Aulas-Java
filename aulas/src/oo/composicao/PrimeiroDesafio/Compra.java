package oo.composicao.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	/**
	 * Métdo para adicionar itens ao Array.
	 * @param p Objeto do tipo Produto.
	 * @param qtde número de itens
	 */
	void addItens(Produto p, int qtde) {
		itens.add(new Item(p, qtde));
	}
	
	/**
	 * Método para adicionar itens ao array sem precisar passar um objeto do tipo Produto.
	 * @param nome Nome que será dado ao Produto.
	 * @param preco Preço que será dado ao Produto.
	 * @param qtde Número de itens.
	 */
	void addItens(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		itens.add(new Item(produto, qtde));
	}
	
	/**
	 * Método para calcular o valor total da compra.
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
