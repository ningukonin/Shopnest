package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class dataFetcher {
	public static List viewProd() {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="SELECT ID,PNAME,PDES,PRICE,PIMG FROM PRODUCT ORDER BY ID";
		String str="";
		List ulist=new ArrayList<>();
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();		
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String temp=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4)+":"+rs.getString(5);
				ulist.add(temp);
				
			}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ulist;
		
	}
	
	
	public static List getInfo() {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="SELECT NAME,EMAIL,GENDER FROM SHOP";
		String str="";
		List ulist=new ArrayList<>();
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();		
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String temp=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3);
				ulist.add(temp);
				
			}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ulist;
		
	}
	
	
		public static String getData(String uname,String pwd) {
		
			
//			String Driver="oracle.jdbc.driver.OracleDriver";
			String url=("jdbc:oracle:thin:@localhost:1521:xe");
			String user="system";
			String pass="system";
			String sql="(SELECT PASSWORD FROM SHOP WHERE NAME=?)";
			String dbpass="";
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,uname);
				ResultSet rs=ps.executeQuery();
				rs.next();
				 dbpass=rs.getString(1);
				 
				 System.out.println(dbpass);
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
			return dbpass;
			
		}
	
		public static boolean edit(int pid,String pname,String pdes,int ppric,String pimg) {
			
		
			String sql="UPDATE PRODUCT SET PNAME=?,PDESC=?,PRICE=?,PIMG=? WHERE ID=?";
			String url=("jdbc:oracle:thin:@localhost:1521:xe");
			String user="system";
			String pass="system";

			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement(sql);
			
				ps.setString(1, pname);
				ps.setString(2, pdes);
				ps.setInt(3,ppric);
				ps.setString(4, pimg);
				ps.setInt(5, pid);
			
	

				ResultSet rs=ps.executeQuery();
			return true;
					
		}
				
			
		catch(Exception e){
			e.printStackTrace();
			System.out.print("not");
			return false;
		}
		 


}
		
		public static String valid(String email) {
			String drive="oracle.jdbc.driver.OracleDriver";
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String sql="SELECT EMAIL FROM SHOP WHERE EMAIL=?";
			
			String str="";
			try {
				Class.forName(drive);
				Connection con=DriverManager.getConnection(url,"system","system");
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,email);
			
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					str=rs.getString(1);
				
				
				}
				return str;
				
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.print("not");
				return str="not";
			}
		
		}
}
