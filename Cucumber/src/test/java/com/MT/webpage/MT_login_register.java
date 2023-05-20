package com.MT.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MT_login_register {
	
	public static WebDriver d;
	
	@Given("Open Chrome browser and open mercury tour website")
	public void opneBrowser()
	{
				System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
				d=new ChromeDriver();
				
				d.get("https://demo.guru99.com/test/newtours/index.php");
				d.manage().window().maximize();
	}
	
	@When("enter username in UserName textbox as {string}")
	public void userName(String un)
	{
		d.findElement(By.name("userName")).sendKeys(un);
	}
	
	@And("Enter passord in password textbox as {string}")
	public void pswd(String psd)
	{
		d.findElement(By.name("password")).sendKeys(psd);
	}
	
	@Then("Click on submit button")
	public void button()
	{
		d.findElement(By.name("submit")).click();
	}
	
	@Then("Display Success page")
	public void msg()
	{
		System.out.println("login successful");
	}

	@Then("navigate to register page")
	public void openRegisterPage()
	{
		d.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@When("enter first name in  textbox as {string}")
	public void fname(String a)
	{
		d.findElement(By.name("firstName")).sendKeys(a);
	}
	
	@And("enter last name in LastName textbox as {string}")
	public void lname(String a)
	{
		d.findElement(By.name("lastName")).sendKeys(a);
	}
	
	@And("enter phone no. in phone textbox as {string}")
	public void phone(String b)
	{
		d.findElement(By.name("phone")).sendKeys(b);
	}
	
	@And("enter email id in email textbox as {string}")
	public void email(String b)
	{
		d.findElement(By.name("userName")).sendKeys(b);
	}

	@And("enter address in address textbox as {string}")
	public void address(String a)
	{
		d.findElement(By.name("address1")).sendKeys(a);
	}
	
	@And("enter city in city textbox as {string}")
	public void city(String a)
	{
		d.findElement(By.name("city")).sendKeys(a);
	}
	
	@And("enter state in state textbox as {string}")
	public void state(String a)
	{
		d.findElement(By.name("state")).sendKeys(a);
	}
	
	@And("enter post in UserName post as {string}")
	public void postalCode(String a)
	{
		d.findElement(By.name("postalCode")).sendKeys(a);
	}
	
	@And("Select country {string}")
	public void selectCountry(String a)
	{
		WebElement findElement = d.findElement(By.name("country"));
		Select s=new Select(findElement);
		s.selectByVisibleText(a);
	}
	
	@And("^enter the user name \"(.*)\"$")
	public void EnterserName(String a)
	{
		d.findElement(By.id("email")).sendKeys(a);
	}
	
	@And("^enter the password \"(.*)\"$")
	public void password(String a)
	{
		d.findElement(By.name("password")).sendKeys(a);
	}
	
	@And("^Enter password for confirmation \"(.*)\"$")
	public void confirmPassword(String a)
	{
		d.findElement(By.name("confirmPassword")).sendKeys(a);
	}
	
	@And("Click on submit button for register")
	public void submit1()
	{
		d.findElement(By.name("submit")).click();
	}
	
	@And("^Get our user name$")
	public void getUserName()
	{
		String text = d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText();
		System.out.println("Our userName is= "+text);
	}
	
	@When("navigate to flight booking")
	public void navigateToFlightBooking()
	{
		d.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
	}

	@And("Select trip oneway or two way")
	public void selectTrip()
	{
		d.findElement(By.cssSelector("input[value='oneway']")).click();
	}
	
	@And("Select number of passenger {string}")
	public void selectPassenger(String a)
	{
		WebElement findElement = d.findElement(By.name("passCount"));
		Select s=new Select(findElement);
		s.selectByVisibleText(a);
	}
	
	@And("Select country for departure {string}")
	public void departureCountry(String a)
	{
		WebElement findElement = d.findElement(By.name("fromPort"));
		Select s=new Select(findElement);
		s.selectByVisibleText(a);
	}
	
	@And("Select departure month as \"(.*)\"$")
	public void departureMonth(String a)
	{
		WebElement findElement = d.findElement(By.name("fromMonth"));
		Select s=new Select(findElement);
		s.selectByVisibleText(a);
	}
	
	@And("Select departure date")
	public void departudeDate()
	{
		WebElement findElement = d.findElement(By.name("fromDay"));
		Select s=new Select(findElement);
		s.selectByIndex(20);
	}
}
