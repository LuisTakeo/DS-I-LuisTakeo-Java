/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

import java.awt.image.ImageObserver;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author CAMARGO
 */
public class Exercic01 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5 ,6 , 7 , 8, 9, 10);
        
        Predicate<Integer> isNumeroPar = 
                numero -> numero % 2 == 0;
        
        Predicate<Integer> isNumeroImpar = 
                numero -> numero % 2 != 0;
        
        BinaryOperator<Integer> somaValor =
                (acc, valor) -> acc += valor;
        
        System.out.println("Numero pares");
        numeros.stream()
                .filter(isNumeroPar)
                .forEach(System.out::println);
        
        System.out.println("Numero impares");
        numeros.stream()
                .filter(isNumeroImpar)
                .forEach(System.out::println);
        
        int somaNumeros = numeros.stream().reduce(somaValor).get();
        
        System.out.printf("Soma dos números: %d", somaNumeros);
        
        
    }
    
}
