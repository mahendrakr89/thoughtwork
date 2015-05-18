package com.danapani.pers.jdbcutil;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JdbcUtil {
	static Connection con = null;
	
	static{
		//Step 1: Load the Driver.
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} //try Ends
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}//Catch Ends
		
	}//Static Block Ends
	//Step 2: Establish the Connection with the Database

	public static Connection getMySQLConnection() throws SQLException{
		String url="jdbc:mysql://localhost:3306/expense";
		Connection con = (Connection) DriverManager.getConnection(url, "root", "P@ssw0rd");
		return con;
	}
	
	
	public static void cleanup(Statement st, Connection con){
		try {
			if(st!= null) st.close(); if(con!=null) con.close();
		} catch (Exception e) {
			
			System.out.println(e);
		}//try Catch end
	}//Cleanup method End

	
	

}
