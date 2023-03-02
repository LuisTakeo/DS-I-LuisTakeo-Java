/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class CaixaDeDialogo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite sua idade")
        );
        String outroValor = Integer.toString(idade);
        double valor = (double) idade;
                
                
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome 
                + "\nSua idade é " + idade + " anos.");
    }
}
