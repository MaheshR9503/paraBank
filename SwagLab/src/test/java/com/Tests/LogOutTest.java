package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Browser;
import com.Webpages.AddToCart;
import com.Webpages.Information;
import com.Webpages.LogOutPage;
import com.Webpages.LoginPage;
import com.Webpages.SelectProduct;

public class LogOutTest extends Browser {
	
	private WebDriver driver;
	LoginPage loginObj;
	SelectProduct productObj;
	AddToCart cartObj;
	Information infoObj;
	LogOutPage logOutObj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		driver=opneBrowser(browser);
		loginObj=new LoginPage(driver);
		productObj=new SelectProduct(driver);
		cartObj=new AddToCart(driver);
		infoObj=new Information(driver);
		logOutObj=new LogOutPage(driver);
	}
	
	@Test(dependsOnMethods = "PaymentPage")
	public void logOut()
	{
		
		System.out.println(logOutObj.getMessage());
		System.out.println(logOutObj.checkImage());
		logOutObj.clickLogout();
	}
	

	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}

}
