package classe.desafioModulo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Guilherme", 72.2);
        Comida c1 = new Comida("Arroz", 0.3);
        Comida c2 = new Comida("Carne", 0.7);

        System.out.println(p1.nomePeso());
        p1.comer(c1);
        p1.comer(c2);

        System.out.println(p1.nomePeso());

    }
}
