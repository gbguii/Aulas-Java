package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    // Construtor explícito
    Produto(String nomeInicial){
        nome = nomeInicial;
    }
    // Construtor padrão
    Produto(){

    }
    static double precoComDesconto(double preco){
        return preco * (1 - desconto);
    }
}
