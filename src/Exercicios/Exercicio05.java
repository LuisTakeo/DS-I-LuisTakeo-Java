/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, altura, area;
        System.out.println("Digite o valor da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextInt();
        
        area = (base * altura) / 2;
        
        System.out.printf("A área do triangulo é de %d", area);
        
        
        entrada.close();
    }
    
}
