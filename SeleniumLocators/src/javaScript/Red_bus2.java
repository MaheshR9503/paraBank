package javaScript;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_bus2 {
		public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.redbus.in/");
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scroll(0,300)");
		
		WebElement src = d.findElement(By.id("src"));
		src.sendKeys("Pune");
		String city = "return document.getElementById(\"src\").value";
		String Leave =(String) js.executeScript(city);
		System.out.println(Leave);
		while(!Leave.equalsIgnoreCase("Sangamwadi, Pune"))
		{
			Thread.sleep(2000);
			src.sendKeys(Keys.DOWN);
			Leave =(String) js.executeScript(city);
			
		}
		src.sendKeys(Keys.ENTER);
		
		WebElement toplace = d.findElement(By.id("dest"));
		toplace.sendKeys("Latur");
		java.lang.String loc = "return document.getElementById(\"dest\").value";
		String city2=(String) js.executeScript(loc);
		System.out.println(city2);
		while(!city2.equalsIgnoreCase("Nalegaon (Latur)"))
		{
			Thread.sleep(1000);
			toplace.sendKeys(Keys.DOWN);
			city2=(java.lang.String) js.executeScript(loc);
			
		}
		toplace.sendKeys(Keys.ENTER);
		
		d.findElement(By.id("onward_cal")).click();
		String monthYear = d.findElement(By.cssSelector("td[class='monthTitle']")).getText();
		System.out.println(monthYear);
		String month = monthYear.split(" ")[0].trim();
		String year = monthYear.split(" ")[1].trim();
		
		while(!(month.equalsIgnoreCase("Nov")&& year.equalsIgnoreCase("2022")))
		{
			d.findElement(By.cssSelector("td[class='next']")).click();
			 monthYear = d.findElement(By.cssSelector("td[class='monthTitle']")).getText();
			 month = monthYear.split(" ")[0].trim();
			 year = monthYear.split(" ")[1].trim();
		}
		 List<WebElement> findElements = d.findElements(By.cssSelector("td[class='wd day']"));
		 int size = findElements.size();
		 System.out.println(size);
		 
		 for(int i=0;i<size;i++)
		 {
			 String text = d.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
			 
			 if(text.equalsIgnoreCase("14"))
			 {
				 d.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
			 }
		 }
		
		 d.findElement(By.id("search_btn")).click();
		 
		 File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotAs, new File("F:\\Java\\SeleniumJar\\ScreenShots\\demo\t.jpg"));
	
		 File screenshotAs2 = ((TakesScreenshot)toplace).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotAs, new File("F:\\Java\\SeleniumJar\\ScreenShots\\redbus>jpg"));
		
		}
}
