package Exercicios;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class NumerosFuncao {
    
    static boolean isPar(int numero){
        return numero % 2 == 0;
    }
    
    static boolean isImpar(int numero){
        return numero % 2 != 0;
    }
    
    static void verificaPar(ArrayList<Integer> numeros){
        System.out.println("Numeros pares");
        numeros.stream()
                .filter(NumerosFuncao::isPar)
                .forEach(System.out::println);
                       
    }
    
    static int somaValores(int acc, int valor){
        return acc += valor;
    }
    
    static void verificaImpar(ArrayList<Integer> numeros){
        System.out.println("Numeros impares");
        numeros.stream()
                .filter(NumerosFuncao::isImpar)
                .forEach(System.out::println);
    }
    
    static int somaPar(ArrayList<Integer> numeros){
        int somaPares = numeros.stream()
                .filter(NumerosFuncao::isPar)
                .reduce(NumerosFuncao::somaValores)
                .get();
        
        System.out.println("O valor da soma dos pares é " + somaPares);
        
        return somaPares;
           
        
    }
    
    static int somaImpar(ArrayList<Integer> numeros){
        int somaImpares = numeros.stream()
                .filter(NumerosFuncao::isImpar)
                .reduce(NumerosFuncao::somaValores)
                .get();
        
        System.out.println("O valor da soma dos impares é " + somaImpares);
           
        return somaImpares;
    }
    
    static void verificaMaior(int valorA, int valorB) {
        if(valorA > valorB){
            System.out.printf("%d é um numero maior que %d\n", valorA, valorB);
        }else{
            System.out.printf("%d é um numero maior que %d\n", valorB, valorA);
        }
    }
    
}
