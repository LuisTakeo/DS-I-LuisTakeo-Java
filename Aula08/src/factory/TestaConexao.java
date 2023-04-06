/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author CAMARGO
 */
public class TestaConexao  {
    public static void main(String[] args) {
        
            
        try {
            Connection connection = new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta");
            connection.close();
        } catch (SQLException sQLException) {
        }
        
    }
}
