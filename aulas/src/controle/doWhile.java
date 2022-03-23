package controle;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        do{
            System.out.println("Quer sair?");
            System.out.print("Você precisa digitar a palavra mágica ... : ");
            texto = sc.nextLine();
        }while(!texto.equalsIgnoreCase("por favor"));

        sc.close();
    }
}
