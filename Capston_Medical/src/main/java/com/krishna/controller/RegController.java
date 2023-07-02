package com.krishna.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.krishna.model.User;
import com.krishna.service.UserService;


public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String contact=request.getParameter("contact");
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		
		User user=new User(name, city, contact, username, password);
		Integer user1 = new UserService().addUser(user);
		
		System.out.println(user1);
		PrintWriter pw=response.getWriter();
		pw.write("User added sucessfully");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
