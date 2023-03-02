/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

/**
 *
 * @author CAMARGO
 */
public class Pessoa {
    
    final private String nome;
    final private String sobrenome;
    private int idade;
    
    
    Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    
    String getNome(){
        return this.nome;
    }
    
    int getIdade(){
        return this.idade;
    }
    
    String getNomeCompleto(){
        return String.format("%s %s", this.nome, this.sobrenome);
    }

    @Override
    public String toString() {
        return this.nome; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
