package Prctice_Websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.guru99.com/test/newtours/register.php");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.name("firstName")).sendKeys("abcd");
		dr.findElement(By.name("lastName")).sendKeys("xyzsl");
		dr.findElement(By.name("phone")).sendKeys("5547896315");
		dr.findElement(By.id("userName")).sendKeys("WWWWW");
		WebElement findElement = dr.findElement(By.name("address1"));
		
	}

}
