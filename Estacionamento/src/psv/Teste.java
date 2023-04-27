/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;
import java.util.*;

/**
 *
 * @author CAMARGO
 */
public class Teste {
    public static void main(String[] args) {
        Connection conexao = Conexao.abrirConexao();
        CarroBean carrobean = new CarroBean();
        CarroDAO carrodao = new CarroDAO(conexao);
        
        
        
        
//        carrobean.setPlaca("EAX1231");
//        carrobean.setCor("Amarelo");
//        carrobean.setDescricao("Carro 3");
//        System.out.println(carrodao.excluir(carrobean));

        List<CarroBean> lista = carrodao.listarTodos();
            if(lista != null){
                for(CarroBean carro : lista){
                    System.out.println("Placa: "+carro.getPlaca());
                    System.out.println("Cor: "+carro.getCor());
                    System.out.println("Descrição:" + carro.getDescricao());
                    System.out.println("");
                }
            }
        
    }
    
}
