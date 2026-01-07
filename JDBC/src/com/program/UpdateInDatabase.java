package com.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateInDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<---------- Enter City Name ---------->");
		String city=br.readLine();
		System.out.println("<---------- Enter email Address ---------->");
		String email=br.readLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		String url="jdbc:mysql://localhost:3306/jdbc_db",pass="root",username="root";
		
		Connection con = DriverManager.getConnection(url,username,pass);
		PreparedStatement statement = con.prepareStatement("update db set city=? where email=?");
		statement.setString(1, city);  
		statement.setString(2, email);
		int executeUpdate = statement.executeUpdate();
		
		if(executeUpdate>0) {
			System.out.println("Update successfully");
		}
		else
			System.out.println("Something Went wrong");
		con.close();
	}
}
