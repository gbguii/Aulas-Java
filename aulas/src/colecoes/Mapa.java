package colecoes;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Luiz");
        usuario.put(2, "João");
        usuario.put(3, "Pedro");
        usuario.put(4, "Maria");

        System.out.println(usuario.isEmpty()); // verifica se esta vazio
        System.out.println(usuario.containsKey(5)); // verifica se tem a key
        System.out.println(usuario.containsValue("Carlos")); // verifica se tem o value


        System.out.println(usuario.keySet()); // todas as key
        System.out.println(usuario.values()); // todos os values
        System.out.println(usuario.entrySet()); // todos as key e values
        System.out.println(usuario.get(3)); // value a partir da key
        System.out.println(usuario.size()); // tamanho do map

        System.out.println(usuario.remove(1)); // remove elemento a partir da key e retorna o value removido
        System.out.println(usuario.entrySet());
        
        for(int chave: usuario.keySet()){
            System.out.println(chave);
        }

        for(String nome: usuario.values()){
            System.out.println(nome);
        }
        for(Entry<Integer, String> chaveValor: usuario.entrySet()){
            System.out.print(chaveValor.getKey()+ " ");
            System.out.println(chaveValor.getValue());
        }
    }
}
