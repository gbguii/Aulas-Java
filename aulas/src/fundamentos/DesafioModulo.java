/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author barbi
 */
public class DesafioModulo {
    public static void main(String[] args) {
        System.out.println("*--- Calculadora ---*");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor inteiro: ");
        double num1 = sc.nextInt();
        
        System.out.print("Digite o segundo valor inteiro: ");
        double num2 = sc.nextInt();
        
        System.out.print("Digite a operação matemática desejada: ");
        String operation = sc.next();
        
        double resultado = "+".equals(operation) ? num1 + num2: 0;
        resultado = "-".equals(operation) ? num1 - num2: resultado;
        resultado = "*".equals(operation) ? num1 * num2: resultado;
        resultado = "/".equals(operation) ? num1 / num2: resultado;
        
        System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, resultado);
        
        sc.close();
    }
}
