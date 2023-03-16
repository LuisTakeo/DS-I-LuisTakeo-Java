/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Calculo {
    
    void escolheCalculo(){
        try{
            int escolhaNumero = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha qual calculo deseja fazer: "
                            + "\n1 - para calculo de área de triangulo "
                            + "\n2 - para calculo de área de quadrado"
                            + "\n3 - para calculo de área de retangulo")
            );
            if(escolhaNumero == 1){
                this.calcularAreaTrianguloRetangulo();
            }else if(escolhaNumero == 2){
                this.calcularAreaQuadrado();
            }else if(escolhaNumero == 3){
                this.calcularAreaRetangulo();
            }else{
                JOptionPane.showMessageDialog(null, "Valor invalido. Insira novamente.");
                this.escolheCalculo();
            }    
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valor invalido. Insira novamente.");
            this.escolheCalculo();
        }    
    
    }    
    
    void calcularAreaTrianguloRetangulo(){
        
        try{
            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Insira o valor da altura do triangulo retangulo")
            );

            double base = Double.parseDouble(
                    JOptionPane.showInputDialog("Insira o valor da base do triangulo retangulo")
            );
            
            if(altura <= 0 || base <= 0) throw new RuntimeException();

            double area = (altura * base) / 2;

            JOptionPane.showMessageDialog(null, 
                    String.format("O valor da area do triangulo é de %.2f", area)
            );
            
            
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, 
                    "Dados inválidos. Insira valores diferentes de 0 e positivos"
            );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Dados inválidos. Insira novamente apenas números"
            );
        }   
    }    
    
     
    
    void calcularAreaQuadrado(){
        
        try{
            double lado = Double.parseDouble(
                    JOptionPane.showInputDialog("Insira o valor dos lados do quadrado: ")
            );
            
            if(lado <= 0) throw new RuntimeException();

            double area = lado * lado;

            JOptionPane.showMessageDialog(null, 
                    String.format("O valor da area do quadrado é de %.2f", area)
            );
            
            
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, 
                    "Dados inválidos. Insira valores diferentes de 0 e positivos"
            );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Dados inválidos. Insira novamente apenas números"
            );
        }   
    }   
    
    void calcularAreaRetangulo(){
        
        try{
            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Insira o valor da altura do retangulo: ")
            );

            double base = Double.parseDouble(
                    JOptionPane.showInputDialog("Insira o valor da base do retangulo: ")
            );
            
            if(altura <= 0 || base <= 0) throw new RuntimeException();
            if(altura == base) throw new Exception();

            double area = altura * base;

            JOptionPane.showMessageDialog(null, 
                    String.format("O valor da area do retangulo é de %.2f", area)
            );
            
            
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, 
                    "Dados inválidos. Insira valores diferentes de 0 e positivos"
            );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Dados inválidos. Insira novamente apenas números e que não sejam iguais"
            );
        }   
    }   
}
