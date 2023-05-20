package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://ksrtc.in/oprs-web/");
		dr.executeScript("scroll(0,300)");
		
		WebElement frm = dr.findElement(By.id("fromPlaceName"));
		frm.sendKeys("ban");
		
		String string = "return document.getElementById(\"fromPlaceName\").value";
		
		String fromPlace =(String) dr.executeScript(string);
		
		while(!fromPlace.equalsIgnoreCase("BANGALORE"))
		{
			Thread.sleep(3000);

			frm.sendKeys(Keys.DOWN);
			string = "return document.getElementById(\"fromPlaceName\").value";
			fromPlace =(String) dr.executeScript(string);
		}
		frm.sendKeys(Keys.ENTER);
		
		
		
		WebElement to = dr.findElement(By.id("toPlaceName"));
		
		String toPlace = "return document.getElementById('toPlaceName').value='pu'";
		
		String target =(String) dr.executeScript(toPlace);
		
		while(!target.equalsIgnoreCase("BIJAPUR"))
		{
			Thread.sleep(3000);

			to.sendKeys(Keys.DOWN);
			toPlace = "return document.getElementById('toPlaceName').value";
			target =(String) dr.executeScript(toPlace);
		}
		
		to.sendKeys(Keys.ENTER);
		
	}
	
	
	
	
	
	
}
