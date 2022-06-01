package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	ArrayList<Integer> lista = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int lengthNum = sc.nextInt();
        
        for(int i = 0; i<lengthNum; i++){
            lista.add(sc.nextInt());
        }
        int contador = 0;
        for(int i = 0; i<lista.size()-1; i++){
            int soma = lista.get(i) + lista.get(i+1);
            boolean verficador = soma < 0;
            if(verficador){
                contador++;
                for(int j = i++; j<lista.size()-1; j++){
                    int soma1 = soma;
                    soma1 += lista.get(j+1);
                    if(soma1 < 0){
                        contador++;
                    }
                }
            }else{
                if(lista.get(i) + lista.get(i) < 0){
                    contador++;
                }
            }
        }
        
        System.out.println(contador);
        sc.close();
	}

}
