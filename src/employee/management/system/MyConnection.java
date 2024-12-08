/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.sql.*;
public class MyConnection {
    public static Connection getConnection(){
    Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis", "root","");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql");
        } catch (ClassNotFoundException | SQLException ex) {
             
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
