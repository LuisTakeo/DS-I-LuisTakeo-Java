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
public class Teste3 {
    public static void main(String[] args) {
        
        FuncoesCalc chamar = new FuncoesCalc();
        try{
            int operador = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "1 para soma \n2 para subtracao \n3 para multi \n4 para divisao")
            );
            if(operador == 1){
                chamar.soma();
            }else if(operador == 2){
                chamar.subtracao();
            }else if(operador == 3){
                chamar.multi();
            }else if(operador == 4){
                chamar.divisao();
            }else{
                System.out.println("Operador inválido.");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
        
        //faça um algoritmo em java no qual o usuario entra com 3 valores
        //identifique o tipo de triangulo que será formado
        //equilatero, isoceles ou escaleno
        
    }
}
