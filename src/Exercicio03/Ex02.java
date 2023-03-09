/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Ex02 {
    
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Insira a sua idade: ")
        );
        
        JOptionPane.showMessageDialog(null, String.format(
                "Sua idade é %d", idade)
        );
        
    }
}
