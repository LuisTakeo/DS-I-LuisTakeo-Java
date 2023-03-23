/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author CAMARGO
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        
        int novoValor = 0;
        int valorSoma = 1;
        int valorAnterior = 0;
        
        
        System.out.println(novoValor);
        System.out.println(valorSoma);
        while(novoValor < 144){
            
//            System.out.println(novoValor);
            novoValor = valorAnterior + valorSoma;
            System.out.println(novoValor);
            valorAnterior = valorSoma;
            valorSoma = novoValor;
                      
            
        }
        
//        System.out.println(valorAnterior);
//        novoValor = valorAnterior + valorSoma;
//        System.out.println(novoValor);
//        valorAnterior = valorSoma;
        
    }
}
