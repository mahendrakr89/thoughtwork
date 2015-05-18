package com.danapani.pers.mod;

public class UserInfo {
	private int userId;
	private String userName;
	private String password;
	
	
	public UserInfo(){
		
	}
	
	public UserInfo(String uName, String password){
		this.userName = uName;
		this.password = password;
		
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
