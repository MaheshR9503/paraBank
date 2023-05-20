package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/register");
		
		d.findElement(By.xpath("//label[@for='gender-male']/preceding-sibling ::*")).click();
		
		d.findElement(By.xpath("//div/label[@for='FirstName']/following-sibling ::*[1]")).sendKeys("ajsbhbs");
		
	}
}
