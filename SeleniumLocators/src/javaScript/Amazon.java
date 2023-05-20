package javaScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		
		String executeScript =(String) js.executeScript("return document.getElementById('twotabsearchtextbox').value='dress'");
	
		while(!executeScript.equalsIgnoreCase("dressing table with mirror"))
		{
			search.sendKeys(Keys.DOWN);
			executeScript =(String) js.executeScript("return document.getElementById('twotabsearchtextbox').value");
		}
		
		search.sendKeys(Keys.ENTER);
		
		Object src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyToDirectory((File) src, new File("F:\\Java\\SeleniumJar\\ScreenShots"));
	}
}
