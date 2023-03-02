/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Operador {
    
    int somar(int A, int B){
        return A + B;
    }
    int subtrair(int A, int B){
        return A - B;
    }
    int multiplicar(int A, int B){
        return A * B;
    }
    int dividir(int A, int B){
        return A / B;
    }
    
    void soma(){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Soma.\nDigite o primeiro valor:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo o valor:"));
        int soma = A + B;
        JOptionPane.showMessageDialog(null, "O valor da soma é " + soma);
    }
    void subtracao(){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Subtração.\nDigite o primeiro valor:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo o valor:"));
        int subracao = A - B;
        JOptionPane.showMessageDialog(null, "O valor da subtração é " + subracao);
    }
    void multiplicacao(){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Multiplicação.\nDigite o primeiro valor:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo o valor:"));
        int multiplicacao = A * B;
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é " + multiplicacao);
    }
    void divisao(){
        double A = Double.parseDouble(JOptionPane.showInputDialog("Divisão.\nDigite o primeiro valor:"));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo o valor:"));
        double divisao = A / B;
        JOptionPane.showMessageDialog(null, "O valor da divisão é " + divisao);
    }
}
