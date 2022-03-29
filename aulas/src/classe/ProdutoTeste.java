package classe;


public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Celular";
        p1.preco = 890.0;

        Produto p2 = new Produto("Notebook");
        //p2.nome = "Notebook";
        p2.preco = 1200.00;

        double precoFinal1 = Produto.precoComDesconto(p1.preco);
        double precoFinal2 = Produto.precoComDesconto(p2.preco);

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
    }
}
