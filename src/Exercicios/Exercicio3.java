/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author CAMARGO
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        int numero = 1;
        while(numeros.size() < 100){
            numeros.add(numero);
            numero++;
        }
        ArrayList<Integer> numeroPares = new ArrayList<>();
        
        
        
        NumerosFuncao.verificaPar(numeros);
        int somaPar = NumerosFuncao.somaPar(numeros);
        
        NumerosFuncao.verificaImpar(numeros);
        int somaImpar = NumerosFuncao.somaImpar(numeros);
        
        NumerosFuncao.verificaMaior(somaPar, somaImpar);
        
//        numeros.stream().forEach(System.out::println);
 
    }
    
    
    
}
