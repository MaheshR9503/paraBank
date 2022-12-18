package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	private WebDriver driver;
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(css = "div[class='header_secondary_container']>span")		private WebElement label;
	@FindBy(css = "button#remove-sauce-labs-bike-light")				private WebElement remove;
	@FindBy(id = "checkout")											private WebElement click;
	
	
	public String checkLabel()
	{
		String text = label.getText();
		return text;
	}

	
	
	public Information inormationObj()
	{
		remove.click();
		
		click.click();
		return new Information(driver);
	}
}
