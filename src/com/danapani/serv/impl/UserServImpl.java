package com.danapani.serv.impl;

import com.danapani.pers.mod.User;
import com.danapani.pers.modtodb.UserToDB;
import com.danapani.serv.UserServ;
import com.danapani.to.Userto;

public class UserServImpl implements UserServ {

	@Override
	public boolean verifyUser(Userto toUser) {
		// TODO Auto-generated method stub
		
		User model = new User();
		UserToDB userInfoToDb = new UserToDB();
		model.setUserName(toUser.getUserName());
		userInfoToDb.UserToDBTrans(model);
		
		
		if(toUser.getUserName().equals(model.getUserName()) && toUser.getPassword().equals(model.getPassword())){
			return true;
		}
		else{
			return false;
		}
		
	}

	
}
