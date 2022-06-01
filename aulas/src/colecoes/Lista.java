package colecoes;
import java.util.ArrayList;
public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario usuario = new Usuario("Guilherme");

        lista.add(usuario);
        lista.add(new Usuario("João"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Barbieri"));
        lista.add(new Usuario("Gabriele"));
        lista.add(new Usuario("Carlos"));   

        System.out.println("Foi removido: "+ lista.remove(new Usuario("Carlos")));
        System.out.println("Contem o nome: "+lista.contains(new Usuario("Pedro")));
        System.out.println(lista.get(4).toString());


        for(Usuario pessoa : lista){
            System.out.println(pessoa.name);
        }

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(65);
        numeros.add(16756);
        System.out.println("Contém: "+ numeros.remove(0));
    }
}
