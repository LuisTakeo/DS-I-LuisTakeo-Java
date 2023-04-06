/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author CAMARGO
 */
public class ConnectionFactory {
    public Connection getConnection(){
        final String url = "jdbc:mysql://localhost/projetojava";
        try{

            return DriverManager.getConnection(
                    url ,"root","");
        }catch(SQLException excecao){
            System.out.println("erro connection factory " + excecao.getMessage());
            throw new RuntimeException(excecao);
        }
    }
}
