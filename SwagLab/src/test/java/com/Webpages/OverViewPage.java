package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Browser;

public class OverViewPage {
	
	WebDriver driver;
	public OverViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
	
	@FindBy(css = "a#item_0_title_link>div")		WebElement productName;
	@FindBy(xpath = "//div[@class='summary_info']/child ::div[2]")	WebElement paymentInfo;
	@FindBy(css = "button#finish")					WebElement finishButton;
	
	
	
	public String getPaymentInformation()
	{
		return paymentInfo.getText();
	}
	
	public void clickOnfinishButton()
	{
		finishButton.click();
	}
	
	public LogOutPage logOutObj()
	{
		
		return new LogOutPage(driver);
	}
}
