package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet<>();

        conjunto.add(1.2);
        conjunto.add(1);
        conjunto.add(true); 
        conjunto.add("e");
        conjunto.add(4);
        conjunto.add('x');

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("e"));
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(2));


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        //conjunto.addAll(nums); // uniao entre 2 conjuntos
        //System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
