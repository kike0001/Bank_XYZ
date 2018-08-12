/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hermon Martinez
 */
public class Conexion {
   
    public static Connection conectarI() throws SQLException{
    try{
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/ban_xyz?zeroDateTimeBehavior=convertToNull","root","1992hermon");

        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    } 
}
