package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {
	
	private WebDriver driver;
	
	public Information(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id = "first-name")					private WebElement firstname;
	@FindBy(id = "last-name")					private WebElement lastName;
	@FindBy(id = "postal-code")					private WebElement postcode;
	@FindBy(id = "continue")					private WebElement click;
	
	
	
	public OverViewPage overViewObj(String a,String b,String c)
	{
		firstname.sendKeys(a);
		postcode.sendKeys(c);
		lastName.sendKeys(b);
		click.click();
		return new OverViewPage(driver);
	}
	
	

}
