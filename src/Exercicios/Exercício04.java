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
public class Exercício04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a, b,res;
        System.out.println("Digite o primeiro valor: ");
        a = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = entrada.nextInt();
        
        res = a + b;
        
        System.out.printf("%d + %d = %d", a, b, res);
        
        entrada.close();
    }
}
