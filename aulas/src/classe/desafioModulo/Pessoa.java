package classe.desafioModulo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }
    }

    String nomePeso(){
        return String.format("%s possui %.2f Kg%n", nome, peso);
    }

}
