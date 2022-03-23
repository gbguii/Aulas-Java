package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class whileExercicio {
    public static void main(String[] args) {
        // programa que leia os valores digitados pelo usuário até que seja digitado "sair"
        // ao final, será mostrado o que foi digitado pelo usuário
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> entradas = new ArrayList<String>();
        
        String resposta = "";
        
        while(!resposta.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            resposta = sc.nextLine();
            entradas.add(resposta);
        }
        System.out.println("Você digitou os seguintes itens: ");
        for(String i: entradas){
            System.out.println(i);
        }
        sc.close();
    }
}
