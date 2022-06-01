package arrays;

import java.util.Arrays;

public class Exercicio {
   public static void main(String[] args) {
       double[] notaAlunoA = new double[4];
       notaAlunoA[0] = 7.0;
       notaAlunoA[1] = 8.8;
       notaAlunoA[2] = 6.5;
       notaAlunoA[3] = 10.0;


        double totalNotaAlunoA = 0;
        for(int i = 0; i < notaAlunoA.length; i++){
            totalNotaAlunoA += notaAlunoA[i];
        }
        String a = Arrays.toString(notaAlunoA);
        System.out.println(a);
        System.out.println(totalNotaAlunoA /notaAlunoA.length);

        double[] notaAlunoB = {10.0, 9.7, 8.8, 9.4};

        double totalNotaAlunoB = 0;
        for(int i = 0; i < notaAlunoB.length; i++){
            totalNotaAlunoB += notaAlunoB[i];
        }

        System.out.println(totalNotaAlunoB /notaAlunoB.length);




    } 
}
