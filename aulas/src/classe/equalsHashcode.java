package classe;

import classe.desafioModulo.Usuario;

public class equalsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Guilherme";
        u1.email = "barbieri@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Guilherme";
        u2.email = "barbieri@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
