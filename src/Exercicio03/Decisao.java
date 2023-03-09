/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author CAMARGO
 */
public class Decisao {
    public static void main(String[] args) {
        
        int idade = 18;
        boolean maiorDeIdade;
        
        if(idade >= 18) {
            maiorDeIdade = true;
        }else{
            maiorDeIdade = false;
        }
        
        System.out.println(maiorDeIdade ? "Maior de idade" : "Menor de idade");
        
        
    }
}
