package com.Base;

import org.testng.annotations.DataProvider;

public class LoginPageData {
	
	@DataProvider
	public String[][] getData1()
	{
		String[][] s=new String[1][2];
		
		s[0][0]="performance_glitch_user";
		s[0][1]="secret_sauce";
		
		return s;
	}

}
