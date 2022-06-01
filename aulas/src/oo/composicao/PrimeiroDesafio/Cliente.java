package oo.composicao.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	/**
	 * Construtor
	 * @param nome
	 */
	Cliente(String nome){
		this.nome = nome;
	}
	
	/**
	 * Método para adicionar Compra ao Array.
	 */
	void addCompra(Compra compra) {
		compras.add(compra);
	}
	
	/**
	 * Calcula o valor total da compra.
	 * @return o valor total da compra.
	 */
	double obterValorTotal() {
		double total = 0;
		for(Compra compraAtual: compras) {
			total += compraAtual.obterValorTotal();
		}
		return total;
	}
}
