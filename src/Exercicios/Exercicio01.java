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
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá mundo!");
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Olá %s, qual a sua idade?", nome);
        int idade = entrada.nextInt();
        System.out.printf("\nMeu nome é %s e você tem %d anos.\n",nome, idade);;
//        dentro das aspas, %s = string, %d = int, %f = double
        double valorGasolina = 4.9248;
        System.out.printf("O valor da gasolina foi %.2f \n", valorGasolina);
        
        
        entrada.close();
    }
    
}
