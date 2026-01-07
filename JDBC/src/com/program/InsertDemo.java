package com.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args) throws Exception{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String username="root";
    	String pass="root";
    	String url="jdbc:mysql://localhost:3306/REGISTER";
    	System.out.println("hii");
        Connection con = DriverManager.getConnection(url,username,pass);
        PreparedStatement statement = con.prepareStatement
        ("insert into db values(11,'Ansari','nhransari@gmail.com')");
        int executeUpdate = statement.executeUpdate();
         
        System.out.println("Successfully running code "+executeUpdate);
        con.close();
    }
}
