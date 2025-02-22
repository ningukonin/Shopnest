package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.dataInjector;
@WebServlet("/x")
public class registerServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String user=req.getParameter("username");
		String pass=req.getParameter("passw");
		String email=req.getParameter("Email");
		String gend=req.getParameter("Gender");
		res.getWriter().print(user+ pass + email + gend );
		
		
		String status=dataInjector.addCustomer(user, pass, email, gend);
		
		res.getWriter().print(status);
		res.sendRedirect("login.jsp");
	}

}
