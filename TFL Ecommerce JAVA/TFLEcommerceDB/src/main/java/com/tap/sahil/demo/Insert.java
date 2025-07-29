package com.tap.sahil.demo;

import java.sql.*;


public class Insert {

    String URL="jdbc:mysql://localhost:3306/tflecommerce";
    String USERNAME="root";
    String PASSWORD ="password";
    Connection conn;

    
public void connDB(){
            try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection Established!");
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }

}


public void insert(){
    


}


    public static void main(String[] args) {
        
    }
}