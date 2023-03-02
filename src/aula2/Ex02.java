/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Soma. Insira o 1º valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Insira o 2º valor: ");
        int valor2 = entrada.nextInt();
        int soma = valor1 + valor2;
        System.out.printf("%d + %d = %d \n", valor1, valor2, soma);
        
        
        System.out.println("Divisão. Insira o 1º valor: ");
        double valorA = entrada.nextDouble();
        System.out.println("Insira o 2º valor: ");
        double valorB = entrada.nextDouble();
        double Divisao = valorA / valorB;
        System.out.printf("%.2f / %.2f = %.2f \n", 
                valorA, valorB, Divisao);
        
        entrada.close();
    }
}
