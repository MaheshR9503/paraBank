package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/register");
		
		d.findElement(By.xpath("//input[@id='gender-male']")).click();
		d.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mahesh");
		d.findElement(By.xpath("//input[@data-val-required='Last name is required.']")).sendKeys("Raghu");
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys("abcd122");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		d.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("12345");
		d.findElement(By.xpath("//input[@id='register-button']")).click();
	}
}
