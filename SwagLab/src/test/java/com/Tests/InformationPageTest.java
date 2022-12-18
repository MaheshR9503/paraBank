package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.Browser;
import com.Base.InformationPageData;
import com.Base.LoginPageData;
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
	
	@BeforeClass
	public void openBrowser()
	{
		driver=opneBrowser();
		loginObj=new LoginPage(driver);
		
	}
	
	
	@Test(priority = 1, dataProvider = "getData1", dataProviderClass = LoginPageData.class)
	public void selectItems(String un, String pswd)
	{
		 productObj = loginObj.selectproductobject(un, pswd);
		 cartObj = productObj.addToCartObj();
		 infoObj = cartObj.inormationObj();
		
	}
	
	@Test(priority = 2,dataProvider = "getData",dataProviderClass = InformationPageData.class)
	public void information(String fname,String lname,String post)
	{
		infoObj.overViewObj(fname, lname, post);
	}
	
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	

}
