package com.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Browser;

import com.Webpages.AddToCart;
import com.Webpages.LoginPage;
import com.Webpages.SelectProduct;
import com.util.Screenshot;

@Listeners(com.common.TestListeners.class)
public class AddToCartTest extends Browser{
	
	private WebDriver driver;
	LoginPage loginObj;
	SelectProduct productObj;
	AddToCart cartObj;
	Screenshot objScreen;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		driver=opneBrowser(browser);
		loginObj=new LoginPage(driver);
		objScreen=new Screenshot();
		lg.info("Browser open");
	}
	
	@Test(priority = 1)
	public void login()
	{
		 productObj = loginObj.selectproductobject(pr.getProperty("username"),pr.getProperty("password"));
		  cartObj = productObj.addToCartObj();
		  lg.info("all items in cart displayed properly");
	}
	
	
	
	@Test(priority = 2)
	public void selectItems()
	{
		
		  cartObj.inormationObj();
		 lg.info("Items is added into cart and removed");
		
	}
	
	
	@AfterMethod
	public void getScreenShhot()
	{
		try {
			objScreen.takeScreenShot();
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
