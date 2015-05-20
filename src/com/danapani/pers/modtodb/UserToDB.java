package com.danapani.pers.modtodb;

import java.sql.SQLException;

import com.danapani.pers.jdbcutil.JdbcUtil;
import com.danapani.pers.mod.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class UserToDB {
	Connection con = null;
	ResultSet rs = null;
	
	public void UserToDBTrans(User model){
		
		
		try {
			con = JdbcUtil.getMySQLConnection();
			Statement st = (Statement) con.createStatement();
//			String query = "select user_name, password from userinfo where user_name =modUser.getUserName()";
			String query = "select user_name, password from userinfo where user_name ='"+model.getUserName()+"'";
			rs = (ResultSet) st.executeQuery(query);
			
			while(rs.next()){
				System.out.println("hi");
				System.out.println(rs.getString(1));
				System.out.println(rs.getString("password"));
				model.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
