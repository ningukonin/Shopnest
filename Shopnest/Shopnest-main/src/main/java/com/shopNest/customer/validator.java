package com.shopNest.customer;

import com.shopNest.dbHandler.dataFetcher;

public class validator {
	public static boolean isValid(String uname,String pwd) {
		String dbpass=dataFetcher.getData(uname, pwd);
		
		if(pwd.equals(dbpass)) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean valid(String mail) {
	String dbpass=dataFetcher.valid(mail);
	
	if(dbpass.equals(mail)) {
		return true;
	}else
	{
		return false;
	}
		
	}


}
