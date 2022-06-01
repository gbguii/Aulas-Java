package arrays;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = sc.nextInt();

        System.out.print("Quantos notas por alunos? ");
        int qtdeNotas = sc.nextInt();

        double[][] notaDaTurma =  new double[qtdeAlunos][qtdeNotas];
        double total =0;
        for(int a = 0; a < notaDaTurma.length; a++){
            for(int n = 0; n< notaDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n+1,a+1 );
                notaDaTurma[a][n] = sc.nextDouble();
                total += notaDaTurma[a][n];
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.printf("A media é igual a %.2f", media);

        sc.close();
    }
}
