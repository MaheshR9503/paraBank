package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Base.Browser;
import com.Base.InformationPageData;
import com.Base.LoginPageData;
import com.Webpages.AddToCart;
import com.Webpages.Information;
import com.Webpages.LogOutPage;
import com.Webpages.LoginPage;
import com.Webpages.OverViewPage;
import com.Webpages.SelectProduct;

public class LoginTest extends Browser {

	private WebDriver driver;
	LoginPage loginObj;

	@BeforeClass
	public void openBrowser()
	{
		driver=opneBrowser();
		loginObj=new LoginPage(driver);
	}
	
	
	@Test(priority = 1)
	public void checkLogo()
	{
		boolean logoPresent = loginObj.isLogoPresent();
		
		Assert.assertTrue(logoPresent, "Logo is Present");
	}
	
	@Test(dataProvider = "getData1", dataProviderClass = LoginPageData.class)
	public void login(String un, String pswd)
	{
		loginObj.selectproductobject(un, pswd);
		
	}
	
	
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	

}
