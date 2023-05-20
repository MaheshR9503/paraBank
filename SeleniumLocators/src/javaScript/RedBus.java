package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class RedBus {

	private static final String String = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://ksrtc.in/oprs-web/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scrollBy(0,200)");
		
		WebElement id = d.findElement(By.id("fromPlaceName"));
		id.sendKeys("raich");
		
		String city = "return document.getElementById(\"fromPlaceName\").value";
		String cityName=(String)js.executeScript(city);
		System.out.println(cityName);
		while(!cityName.equalsIgnoreCase("RAICHUR KA AP BORDER"))
		{
			Thread.sleep(2000);
			id.sendKeys(Keys.DOWN);
			 city = "return document.getElementById(\"fromPlaceName\").value";
//			System.out.println(cityName);
			id.sendKeys(Keys.ENTER);
		}
		id.sendKeys(Keys.ENTER);
		d.switchTo().alert().accept();
		WebElement toplace = d.findElement(By.id("toPlaceName"));
		toplace.sendKeys("beng");
		java.lang.String loc = "return document.getElementById(\"toPlaceName\".value";
		String city2=(java.lang.String) js.executeScript(loc);
		System.out.println(city2);
	//	while(!city2.equalsIgnoreCase("))
	}
}
