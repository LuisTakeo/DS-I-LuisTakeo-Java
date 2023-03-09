/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;

import java.util.function.IntBinaryOperator;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Teste {
    public static void main(String[] args) {
        FuncoesCalc chamar = new FuncoesCalc();
        String operador = JOptionPane.showInputDialog(
                "Digite o operador (+ - * /)");
        if(operador.equals("+")){
            chamar.soma();
        }else if(operador.equals("-")){
            chamar.subtracao();
        }else if(operador.equals("*")){
            chamar.multi();
        }else if(operador.equals("/")){
            chamar.divisao();
        }else{
            System.out.println("Operador inválido.");
        }
        
        
        
        
        
        IntBinaryOperator calcular = (x, y) -> x + y;
        
        System.out.println(calcular.applyAsInt(5, 10));
        
    }
}
