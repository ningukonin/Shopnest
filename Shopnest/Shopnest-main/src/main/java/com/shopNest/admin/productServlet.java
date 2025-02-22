package com.shopNest.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.dataInjector;
@WebServlet("/addp")
public  class  productServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int pid=Integer.parseInt(req.getParameter("idf"));
	String pname=req.getParameter("pnf");
	String pdes=req.getParameter("pdesf");
	int ppric=Integer.parseInt(req.getParameter("pprc"));
	String pimg=req.getParameter("imgf");
	
	
	boolean bl=dataInjector.addP(pid,pname,pdes,ppric,pimg);
	if(bl==true) {
		resp.getWriter().print("successfully");
	}else {
		resp.getWriter().print("sry");
	}
	}

}
