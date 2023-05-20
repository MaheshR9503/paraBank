package com.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
WebDriver d;
	
	@Given("^Open Chrome browser for register page of MT website$")
	public void opneBrowser()
	{
				System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
				d=new ChromeDriver();
				
				d.get("https://demo.guru99.com/test/newtours/register.php");
				d.manage().window().maximize();
	}
	
	
	@When("^Enter in register page$")
	public void enterRegister()
	{
		d.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@When("^enter first name in UserName textbox as \"(.*)\"$")
	public void fname(String a)
	{
		d.findElement(By.name("firstName")).sendKeys(a);
	}
	
	@And("^enter last name in LastName textbox as \"(.*)\"$")
	public void lname(String a)
	{
		d.findElement(By.name("lastName")).sendKeys(a);
	}
	
	@And("^enter phone no. in phone textbox as \"(.*)\"$")
	public void phone(String b)
	{
		d.findElement(By.name("phone")).sendKeys(b);
	}
	
	@And("^enter email id in email textbox as \"(.*)\"$")
	public void email(String b)
	{
		d.findElement(By.name("userName")).sendKeys(b);
	}

	@And("^enter address in address textbox as \"(.*)\"$")
	public void address(String a)
	{
		d.findElement(By.name("address1")).sendKeys(a);
	}
	
	@And("^enter email id in email textbox as \"(.*)\"$")
	public void city(String b)
	{
		d.findElement(By.name("city")).sendKeys(b);
	}
	
}
