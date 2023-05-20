package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("https://www.redbus.in/");
		WebElement findElement = dr.findElement(By.id("src"));
		findElement.sendKeys("na");
	
	
//		dr.executeScript("scroll(0,700)");
		String from = "return document.getElementById(\"src\").value";
		
		String city1 =(String) dr.executeScript(from);
		
		System.out.println(city1);
		
		while(!city1.equalsIgnoreCase("Naneghat Package"))
		{
			Thread.sleep(3000);
			
			findElement.sendKeys(Keys.DOWN);
			from = "return document.getElementById(\"src\").value";
		}
		
		findElement.sendKeys(Keys.ENTER);
	}
}
