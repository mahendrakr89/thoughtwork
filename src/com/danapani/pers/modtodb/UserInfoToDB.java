package com.danapani.pers.modtodb;

import java.sql.SQLException;

import com.danapani.pers.jdbcutil.JdbcUtil;
import com.danapani.pers.mod.UserInfo;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class UserInfoToDB {
	Connection con = null;
	ResultSet rs = null;
	
	public void UserInfoToDBTrans(){
		UserInfo modUser= new UserInfo();
		
		try {
			con = JdbcUtil.getMySQLConnection();
			Statement st = (Statement) con.createStatement();
			String query = "select user_name, password from userinfo where user_name =modUser.getUserName()";
			rs = (ResultSet) st.executeQuery(query);
			
			while(rs.next()){
				modUser.setPassword(rs.getString("PASSWORD"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
