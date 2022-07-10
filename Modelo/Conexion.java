/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Anyelo
 */
public class Conexion {
    
    Connection connection;
    //String Driver = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/reto1_g55";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    public Conexion (){
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection != null) {
              System.out.println( "Conectados a la base"); 
            }
           
        } catch (ClassNotFoundException | SQLException e) {
           System.out.println("No se pudo establecer conexion a la base");
        }
    }
    
    public Connection getConnection(){
     return connection;
    }

    
}
