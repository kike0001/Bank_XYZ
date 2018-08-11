/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AG
 */
public class coneccion {
    static Statement Sentencia;
    static ResultSet Resultado; 
    public static Connection conectarI() throws SQLException{
    try{
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/ban_xyz","root","Ezreal21");

        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    } 
}
