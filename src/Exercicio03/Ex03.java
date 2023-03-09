package Exercicio03;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class Ex03 {
    
    public static void main(String[] args) {
        
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
    
    
}
