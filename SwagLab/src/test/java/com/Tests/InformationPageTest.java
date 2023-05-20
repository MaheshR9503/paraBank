package com.Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Browser;
import com.Base.InformationPageData;

import com.Webpages.AddToCart;
import com.Webpages.Information;
import com.Webpages.LoginPage;
import com.Webpages.SelectProduct;

public class InformationPageTest extends Browser {
	
	private WebDriver driver;
	LoginPage loginObj;
	SelectProduct productObj;
	AddToCart cartObj;
	Information infoObj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		driver=opneBrowser(browser);
		loginObj=new LoginPage(driver);
		
	}
	
	
	@Test(priority = 1)
	public void selectItems()
	{
		 productObj = loginObj.selectproductobject(pr.getProperty("username"),pr.getProperty("password"));
		 cartObj = productObj.addToCartObj();
		 infoObj = cartObj.inormationObj();
		
	}
	
	@Test(priority = 2 )
	public void information()
	{
		infoObj.overViewObj();
	}
	
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	

}
