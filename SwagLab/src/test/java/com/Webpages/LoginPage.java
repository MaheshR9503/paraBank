package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id = "user-name")						private WebElement username;
	@FindBy(id = "password")						private WebElement password;
	@FindBy(id = "login-button")					private WebElement login;
	@FindBy(css = "div[class='login_logo']")		private WebElement logo;
	
	
	
	public boolean isLogoPresent()
	{
		return logo.isDisplayed();
	}
	
	
	

	public SelectProduct selectproductobject(String un,String pswd)
	{
		username.sendKeys(un);
		password.sendKeys(pswd);
		login.click();
		return new SelectProduct(driver);
	}
	
	
	
	

}
