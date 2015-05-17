package com.danapani.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. collect the data
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = null;
		// 2.process the data
		if (username.equals(password)) {
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
