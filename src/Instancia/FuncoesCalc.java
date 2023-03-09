/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class FuncoesCalc {
    
    
    void soma(){
        int valorA = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um primeiro valor: ")
        );
        int valorB = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um segundo valor: ")
        );
        
        int soma = valorA + valorB;
        
        JOptionPane.showMessageDialog(null, 
                String.format("%d + %d = %d", valorA, valorB, soma)
        );
        
    }
    
    void subtracao(){
        int valorA = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um primeiro valor: ")
        );
        int valorB = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um segundo valor: ")
        );
        
        int subtracao = valorA - valorB;
        
        JOptionPane.showMessageDialog(null, 
                String.format("%d - %d = %d", valorA, valorB, subtracao)
        );
        
    }
    
    void multi(){
        int valorA = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um primeiro valor: ")
        );
        int valorB = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um segundo valor: ")
        );
        
        int multi = valorA * valorB;
        
        JOptionPane.showMessageDialog(null, 
                String.format("%d * %d = %d", valorA, valorB, multi)
        );
        
    }
    
    void divisao(){
        int valorA = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um primeiro valor: ")
        );
        int valorB = Integer.parseInt(
                JOptionPane.showInputDialog("Insira um segundo valor: ")
        );
        
        int divisao = valorA / valorB;
        
        JOptionPane.showMessageDialog(null, 
                String.format("%d / %d = %d", valorA, valorB, divisao)
        );
        
    }
    
    int soma(int a, int b){
        return a + b;
    }
    
    int subtracao(int a, int b){
        return a - b;
    }
    
    int multiplicacao(int a, int b){
        return a * b;
    }
    
    int divisao(int a, int b){
        return a / b;
    }
    
}
