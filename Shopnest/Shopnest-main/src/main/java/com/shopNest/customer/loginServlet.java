package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/l")

public class loginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String user=req.getParameter("luser");
		String pass=req.getParameter("lpass");


		boolean valid=validator.isValid(user, pass);
		if(valid==true && user.equals("admin")) {
			res.sendRedirect("admin.jsp");
		}else if(valid==true ) {
			res.sendRedirect("home.jsp");
		}else {
			res.sendRedirect("login.jsp");
		}
		
		
		
	}
}
