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
public class Ex01 {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(
                JOptionPane.showInputDialog("Insira o seu nome"),
                Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade: "))
        );
        JOptionPane.showMessageDialog(null, String.format("Seu nome é %s e sua idade é %d", 
                p1.getNome(), p1.getIdade()));
        
//        String nome = JOptionPane.showInputDialog("Insira o seu nome");
//        JOptionPane.showMessageDialog(null, "O seu nome é" + nome);
    }
    
}
