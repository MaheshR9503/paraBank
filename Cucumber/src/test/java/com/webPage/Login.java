package com.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	
	WebDriver d;
	
	@Given("^Open Chrome browser and open mercury tour website$")
	public void opneBrowser()
	{
				System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
				d=new ChromeDriver();
				
				d.get("https://demo.guru99.com/test/newtours/index.php");
				d.manage().window().maximize();
	}
	
	@When("^enter username in UserName textbox as \"(.*)\"$")
	public void userName(String un)
	{
		d.findElement(By.name("userName")).sendKeys(un);
	}
	
	@And("^Enter passord in password textbox as \"(.*)\"$")
	public void pswd(String psd)
	{
		d.findElement(By.name("password")).sendKeys(psd);
	}
	
	@Then("^Click on submit button$")
	public void button()
	{
		d.findElement(By.name("submit")).click();
	}
	
	@Then("^Display Success page$")
	public void msg()
	{
		WebElement findElement = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
		System.out.println(findElement.getText());
	}

}
