package com.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Base.Browser;


import com.Webpages.AddToCart;
import com.Webpages.Information;
import com.Webpages.LogOutPage;
import com.Webpages.LoginPage;
import com.Webpages.OverViewPage;
import com.Webpages.SelectProduct;
import com.util.Screenshot;

public class LoginTest extends Browser {

	private WebDriver driver;
	LoginPage loginObj;
	Screenshot ss;
	
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		driver=opneBrowser(browser);
		loginObj=new LoginPage(driver);
		ss=new Screenshot();
	}
	
	
	@Test(priority = 1)
	public void checkLogo()
	{
		boolean logoPresent = loginObj.isLogoPresent();
		
		Assert.assertTrue(logoPresent, "Logo is Present");
		lg.info("assert successful");
	}
	
	@Test(priority = 2)
	public void login()
	{
		loginObj.selectproductobject(pr.getProperty("username"),pr.getProperty("password"));
		lg.info("login successful");
	}
	
	@AfterMethod
	public void getScreenshot()
	{
		try {
			ss.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	

}
