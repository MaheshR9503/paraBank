package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectProduct {
	
	private WebDriver driver;
	
	public SelectProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath = "//div[@class='inventory_list']/child ::div[2]/child ::div[2]/child ::div[1]/child ::a")
	@CacheLookup WebElement bikelightName;
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='inventory_list']/child ::div[4]/child ::div[2]/child ::div[1]/child ::a/child ::div")
	WebElement redshirtName;
	
	@FindBy(xpath = "//div[@class='inventory_list']/child ::div[2]/child ::div[2]/child ::div[2]/child ::button")
	WebElement bikeLight;
	
	@FindBy(css = "select[class='product_sort_container']")			WebElement dropDown;
	@FindBy(xpath = "//div[@class='inventory_list']/child ::div[4]/child ::div[2]/child ::div[2]/child ::button")
	WebElement redTshirt;
	
	@FindBy(css = "a[class='shopping_cart_link']")
	WebElement cart;
	
	
	public AddToCart addToCartObj()
	{
		bikeLight.click();
		Select s=new Select(dropDown);
		s.selectByVisibleText("Price (low to high)");
		redTshirt.click();
		cart.click();
		return new AddToCart(driver);
	}

}
