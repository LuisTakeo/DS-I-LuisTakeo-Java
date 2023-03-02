/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

/**
 *
 * @author CAMARGO
 */
public class teste {
    public static void main(String[] args) {
        Operador calculadora = new Operador();
        System.out.println(calculadora.somar(15,12));
        System.out.println(calculadora.subtrair(15,12));
        System.out.println(calculadora.multiplicar(15,12));
        System.out.println(calculadora.dividir(15,12));
        calculadora.soma();
        calculadora.subtracao();
        calculadora.multiplicacao();
        calculadora.divisao();
        
    }
}
