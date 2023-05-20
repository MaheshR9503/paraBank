package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.redbus.in/");
		
		
		WebElement from = d.findElement(By.id("src"));
		from.sendKeys("pune");
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		js.executeScript("scroll(0,200)");
		
		String string = "return document.getElementById(\"src\").value";
		
		String city=(String)js.executeScript(string);
		
		while(!city.equalsIgnoreCase("Sangamwadi, Pune"))
		{
			Thread.sleep(2000);
			from.sendKeys(Keys.DOWN);
			string = "return document.getElementById(\"src\").value";
			city=(String)js.executeScript(string);
		}
		
		from.sendKeys(Keys.ENTER);
		
		
		
	}

}
