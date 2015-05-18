package com.danapani.client;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.danapani.pers.mod.UserInfo;
import com.danapani.serv.UserInfoServ;
import com.danapani.serv.impl.UserInfoServImpl;
import com.danapani.to.UserInfoto;

public class UserLogin extends HttpServlet {
	@Override
	public  void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. collect the data
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = null;
		// 2.process the data
		UserInfoto toUser = new UserInfoto(username, password);
		UserInfoServ userService = new UserInfoServImpl();
		
		if (userService.checkUser(toUser)) {
			message = "<h1><font color='green'> Welcome to Danapani</font></h>";
			

		} else {
			message = "<h1><font color='red'>Usernamae and password doesn't match</font></h1>"
					+ "<input type='text' name='name'/>";
		}
		
		
		// forward the response
		Writer out = response.getWriter();
		out.write(message);
	}

}
