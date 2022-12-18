package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.Browser;
import com.Base.LoginPageData;
import com.Webpages.AddToCart;
import com.Webpages.LoginPage;
import com.Webpages.SelectProduct;

public class AddToCartTest extends Browser{
	
	private WebDriver driver;
	LoginPage loginObj;
	SelectProduct productObj;
	AddToCart cartObj;
	
	
	@BeforeClass
	public void openBrowser()
	{
		driver=opneBrowser();
		loginObj=new LoginPage(driver);
		
		
	}
	
	@Test(dataProvider = "getData1", dataProviderClass = LoginPageData.class)
	public void selectItems(String un, String pswd)
	{
		 productObj = loginObj.selectproductobject(un, pswd);
		  cartObj = productObj.addToCartObj();
		  cartObj.inormationObj();
		
	}
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	

}
