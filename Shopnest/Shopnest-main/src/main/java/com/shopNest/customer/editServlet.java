package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.dataFetcher;


@WebServlet("/ep1")
public class editServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("idf"));
		String name=req.getParameter("pnf");
	
		String des=req.getParameter("pdesf");
		
		int price=Integer.parseInt(req.getParameter("pprc"));
		
		String img=req.getParameter("imgf");
		System.out.println(price);
		boolean bl=dataFetcher.edit(id, name, des, price, img);
		
		if(bl==true) {
			resp.getWriter().print("successfully");
		}else {
			resp.getWriter().print("OOps try again");
		}
		
		
	}

}
