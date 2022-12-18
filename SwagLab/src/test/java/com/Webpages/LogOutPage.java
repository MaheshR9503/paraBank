package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	WebDriver driver;
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(css = "h2[class='complete-header']")				private	WebElement msg;
	@FindBy(css = "img[alt='Pony Express']")					private	WebElement img;
	@FindBy(id = "react-burger-menu-btn")						private WebElement click;
	@FindBy(id = "logout_sidebar_link")							private WebElement logout;
	
	public String getMessage()
	{
		return msg.getText();
		
	}
	
	public boolean checkImage()
	{
		return img.isDisplayed();
	}
	public void clickLogout()
	{
		click.click();
		logout.click();
	}
}
