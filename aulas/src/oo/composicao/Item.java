package oo.composicao;

public class Item {
	
	String nomeProduto;
	double preco;
	int quantidade; 
	Compra compra;
	
	Item(String nome, Double preco, int quantidade){
		this.nomeProduto = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
}
