package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




public class dataInjector {
	
	
	public static boolean addP(int pid,String pname,String pdes,int ppric,String pimg) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url=("jdbc:oracle:thin:@localhost:1521:xe");
		String user="system";
		String pass="system";
		String sql="INSERT INTO PRODUCT VALUES(?,?,?,?,?)";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setString(3, pdes);
			ps.setInt(4, ppric);
			ps.setString(5, pimg);
			ps.executeUpdate();
			return true;
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
public static String addCustomer(String NAME,String PASSWORD,String EMAIL,String GENDER) {
	
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url=("jdbc:oracle:thin:@localhost:1521:xe");
		String user="system";
		String pass="system";
		String sql="INSERT INTO SHOP VALUES(?,?,?,?)";
		String str="";
		
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,NAME);
			ps.setString(2, PASSWORD);
			ps.setString(3, EMAIL);
			ps.setString(4, GENDER);
			ps.executeUpdate();
			return str="Success";
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
System.out.println("done bro");
return str;
		}
	}



public static boolean updatePass(String email,String pass) {
	String drive="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String sql="UPDATE SHOP SET PASSWORD=? WHERE EMAIL=? ";
		try {
			Class.forName(drive);
			Connection con=DriverManager.getConnection(url,"system","system");
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, pass);
			ps.setString(2, email);
			ps.executeUpdate();
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
}
	

}
