package arrays.desafios;

import java.util.Scanner;

public class MediaComFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int xNotas = 0;

        System.out.print("Quantas notas serão inseridas ?");
        xNotas = sc.nextInt();
        double[] notas = new double[xNotas];
        for(int i = 0; i < xNotas; i++){
            System.out.printf("Informe a nota %d: ", i+1);
            notas[i] = sc.nextDouble();
        }
        double somaNotas =0;
        for(double nota: notas){
            somaNotas += nota;
        }
        double media = somaNotas / xNotas;
        System.out.printf("A média é igual a %.2f", media);
        
        sc.close();
    }
}
