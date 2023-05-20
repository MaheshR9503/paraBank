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
import com.Webpages.LoginPage;
import com.Webpages.OverViewPage;
import com.Webpages.SelectProduct;

public class OverViewPageTest extends Browser{

	private WebDriver driver;
	LoginPage loginObj;
	SelectProduct productObj;
	AddToCart cartObj;
	Information infoObj;
	OverViewPage overVieObj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		driver=opneBrowser(browser);
		loginObj=new LoginPage(driver);
		productObj=new SelectProduct(driver);
		cartObj=new AddToCart(driver);
		infoObj=new Information(driver);
		overVieObj =new OverViewPage(driver);
	}
	
	@Test()
	public void PaymentPage()
	{
		
		System.out.println(overVieObj.getPaymentInformation());
		overVieObj.clickOnfinishButton();
	}
	

	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
}
