package controle;

import java.util.Scanner;

public class exercicioWhileProposto {
    public static void main(String[] args) {
        // programa que leia as notas da turma e apos digitar -1 apresentar:
        // média
        // numero de notas inseridas

        Scanner sc = new Scanner(System.in);
        double notas = 0;
        double recebedor = 0;
        int contador = 0;
        while(notas >= 0){
            System.out.print("Digite a nota para ser inserida: ");
            notas = sc.nextDouble();
            if(notas > 0 && notas <= 10){
            recebedor += notas;
            contador++;
            }else if(notas != -1){
                System.out.println("Range de notas é de 0 a 10.");
            }
        }
        double media = recebedor / contador;
        
        System.out.printf("A média é igual a %.2f%nNúmeros de notas inseridas: %d ", media, contador);


        sc.close();
    }
}
