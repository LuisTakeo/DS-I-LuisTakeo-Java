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
public class testeTriangulo {
    
    public static void main(String[] args) {
        
        int ladoA, ladoB, ladoC;
        boolean equilatero, isoceles, escaleno;
        try{
            ladoA = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira o lado do triangulo")
            );
            ladoB = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira o lado do triangulo")
            );
            ladoC = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira o lado do triangulo")
            );
            
            
            equilatero = ladoA == ladoB && ladoA == ladoC;
            isoceles = ladoA == ladoB || ladoA == ladoC || ladoB == ladoC;
            escaleno = ladoA != ladoB && ladoA != ladoC || ladoB != ladoC;
            
            if(equilatero){
                System.out.println("Equilatero");
            }else if(isoceles){
                System.out.println("Isoceles");
            }else if(escaleno){
                System.out.println("Escaleno");
            }else{
                System.out.println("valor invalido");
            }
            
            
        }catch(Exception err){
            System.out.println("valor invalido");
            
        }
    }
}
