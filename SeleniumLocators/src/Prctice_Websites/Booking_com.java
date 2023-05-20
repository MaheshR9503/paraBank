package Prctice_Websites;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.KnownElements;

public class Booking_com {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.booking.com/");
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		WebElement dest = d.findElement(By.cssSelector("input#ss"));
		dest.sendKeys("triv");
		String city = "return document.getElementById(\"ss\").value";
		String s=(String)js.executeScript(city);
		
		
		while(!s.equalsIgnoreCase("Thiruvananthapuram Central, Trivandrum, Kerala, India"))
		{
			dest.sendKeys(Keys.DOWN);
			s=(String)js.executeScript(city);
		}
		dest.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("span[class='xp__guests__count']")).click();
		d.findElement(By.cssSelector("div[class='sb-group__field sb-group__field-adults'] button[data-bui-ref='input-stepper-add-button']")).click();
		d.findElement(By.cssSelector("div[class='bui-stepper'] button[aria-label='Increase number of Rooms']")).click();
	
		d.findElement(By.cssSelector("button[data-sb-id='main']")).click();
	}
}
