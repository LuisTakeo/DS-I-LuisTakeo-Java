/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

import java.util.ArrayList;

/**
 *
 * @author luist
 */
public class Exercicio {
    
    static void exercicio(){
        ArrayList<Integer> numeros = new ArrayList();
        int i = 1, somaPar, somaImpar;
        while(numeros.size() < 100) numeros.add(i++);
               
//        System.out.println(numeros);
        ArrayList<Integer> numerosPares = new ArrayList();
        ArrayList<Integer> numerosImpares = new ArrayList();

        numeros.stream()
                .filter(Exercicio::isPar)
                .forEachOrdered(numerosPares::add);
        
        System.out.println("Numeros Pares");
        numerosPares.stream().forEach(Exercicio::mostraTexto);
        System.out.println("====================");
        somaPar = numerosPares.stream().reduce(Exercicio::soma).get();
        System.out.printf("Soma pares: %d \n", somaPar);
        System.out.println("====================");
        
        
        numeros.stream()
                .filter(n -> n % 2 != 0)
                .forEachOrdered(numerosImpares::add);
        
        System.out.println("Numeros Impares");
        numerosImpares.stream().forEach(Exercicio::mostraTexto);
        
        somaImpar = numerosImpares.stream().reduce(Exercicio::soma).get();
        System.out.println("====================");
        System.out.printf("Soma impares: %d \n", somaImpar);
        
        System.out.println("====================");
        System.out.println(Exercicio.mostraMaior(somaPar, somaImpar));
    }
    
    
    static boolean isPar(int n) {
        return n % 2 == 0;
    }

    static boolean isImpar(int n) {
        return n % 2 != 0;
    }

    static int soma(int acc, int valor) {
        return acc += valor;
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
    
    static String mostraMaior(int n, int m){
        if(n > m){
            return String.format("O valor de %d é maior que %d",
                    n, m);
        }else if(m > n){
            return String.format("O valor de %d é maior que %d",
                    m, n);
        }else{
            return String.format("Os valores %d e %d são iguais", m, n);
        }
    }

}
