package com.danapani.serv.impl;

import com.danapani.pers.mod.UserInfo;
import com.danapani.pers.modtodb.UserInfoToDB;
import com.danapani.serv.UserInfoServ;
import com.danapani.to.UserInfoto;

public class UserInfoServImpl implements UserInfoServ {

	@Override
	public boolean checkUser(UserInfoto toUser) {
		// TODO Auto-generated method stub
		
		UserInfo ModUser = new UserInfo();
		UserInfoToDB userInfoToDb = new UserInfoToDB();
		ModUser.setUserName(toUser.getUserName());
		userInfoToDb.UserInfoToDBTrans();
		
		
		if(toUser.getUserName()==ModUser.getUserName() && toUser.getPassword()==ModUser.getPassword()){
			return true;
		}
		else{
			return false;
		}
		
	}

	
}
