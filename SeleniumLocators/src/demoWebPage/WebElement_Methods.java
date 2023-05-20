package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/register");
		
		WebElement gen = d.findElement(By.cssSelector("input#gender-male"));
		gen.click();
		
		WebElement FirN = d.findElement(By.xpath("//input[@id='FirstName']"));
		FirN.sendKeys("Mahesh");
		
		WebElement LastN = d.findElement(By.xpath("//input[@id='LastName']"));
		LastN.sendKeys("RRR");
		
		WebElement email = d.findElement(By.xpath("//input[@name='Email']"));
		email.sendKeys("abd0123@gmail.com");
		
		WebElement pass = d.findElement(By.cssSelector("input#Password"));
		pass.sendKeys("123456");
		
		WebElement ConfPas = d.findElement(By.cssSelector("input#ConfirmPassword"));
		ConfPas.sendKeys("123456");
		
//		WebElement reg = d.findElement(By.xpath("//input[@name='register-button']"));
//		reg.submit();
		
		String attribute = FirN.getAttribute("FirstName");
		System.out.println(attribute);
		
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = pass.isEnabled();
		System.out.println(enabled);
		
		
	}
}
