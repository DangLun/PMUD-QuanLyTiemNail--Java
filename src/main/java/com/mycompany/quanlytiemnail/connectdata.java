/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlytiemnail;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author trand
 */
public class connectdata {
    public static Connection getConnection(){
        try{
            String username = "root"; 
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "jdbc:mysql://localhost:3306/quanlytiemnail?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(sql,username, password);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connect Fail");
            return null;
        }
    }
}
