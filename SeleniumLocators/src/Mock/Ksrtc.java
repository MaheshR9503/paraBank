package Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://ksrtc.in/oprs-web/");
		
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)dr;
		
		js.executeScript("scroll(0,300)");
		
		WebElement from = dr.findElement(By.id("fromPlaceName"));
		from.sendKeys("ban");
		
		String city = "return document.getElementById(\"fromPlaceName\").value";
		
		String s1=(String)js.executeScript(city);
		
		while(s1.equalsIgnoreCase("BANGALORE"))
		{
			Thread.sleep(2000);
			from.sendKeys(Keys.DOWN);
			city = "return document.getElementById(\"fromPlaceName\").value";
			s1=(String)js.executeScript(city);
			
		}
		from.sendKeys(Keys.ENTER);
		
	}

}
