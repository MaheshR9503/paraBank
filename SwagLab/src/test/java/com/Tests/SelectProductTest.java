package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Base.Browser;
import com.Webpages.AddToCart;
import com.Webpages.LoginPage;
import com.Webpages.SelectProduct;

public class SelectProductTest extends Browser {

	private WebDriver driver;
	LoginPage loginObj;
	SelectProduct productObj;
	
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		driver=opneBrowser(browser);
		loginObj=new LoginPage(driver);
		
	}
	
	@Test()
	public void addItemsToCart() {
		
		productObj = loginObj.selectproductobject(pr.getProperty("username"),pr.getProperty("password"));
		productObj.addToCartObj();
	}
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	
}
