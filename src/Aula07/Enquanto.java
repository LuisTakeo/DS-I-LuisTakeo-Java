/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

import java.util.ArrayList;

/**
 *
 * @author CAMARGO
 */
public class Enquanto {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<Integer> numerosPares = new ArrayList();
        ArrayList<Integer> numerosImpares = new ArrayList();
        int valor = 1;
        while(numeros.size() < 100){ 
            if(Enquanto.isPar(valor)){
                numerosPares.add(valor);
            }else if(Enquanto.isImpar(valor)){
                numerosImpares.add(valor);
            }
            numeros.add(valor++);
        }
        
        int somaPar = numerosPares.stream().reduce(Enquanto::soma).get();
        int somaImpar = numerosImpares.stream().reduce(Enquanto::soma).get();
        
        System.out.println("Pares:");
        numerosPares.stream().forEachOrdered(Enquanto::mostraTexto);
        System.out.println("Impares:");
        numerosImpares.stream().forEachOrdered(Enquanto::mostraTexto);
        System.out.printf("\n\nSoma dos pares: %d \n",somaPar);
        System.out.printf("Soma dos impares: %d \n",somaImpar);
        
        
        
    }
    static boolean isPar(int numero){
        return numero % 2 == 0;
    }
    
    static boolean isImpar(int numero){
        return numero % 2 != 0;
    }
    
    static int soma(int acumulador, int valorNovo){
        return acumulador += valorNovo;
    }
    
    static void mostraTexto(int n) {
        if ((n % 10 == 0) || (n % 10 == 9 && n > 10)) {
            System.out.printf("%d \n", n);
        } else if (n % 10 == 9) {
            System.out.printf(" %d \n", n);
        } else if (n < 10) {
            System.out.printf(" %d  ", n);
        } else {
            System.out.printf("%d  ", n);
        }
    }
    
}
