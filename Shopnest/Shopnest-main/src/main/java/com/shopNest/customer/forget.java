package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.dataInjector;
@WebServlet("/forget")
public class forget extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String mail=req.getParameter("formail");
		String pass=req.getParameter("newpass");
		boolean bl=validator.valid(mail);
	if(bl) {
		boolean ck=dataInjector.updatePass(mail, pass);
		if(ck) {
			res.getWriter().print("updated successfully");
		}
	}else {
		res.getWriter().print("oops sry");
	}
	}

}
