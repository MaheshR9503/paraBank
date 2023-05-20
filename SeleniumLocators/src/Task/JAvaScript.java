package Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAvaScript {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.redbus.in/");
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor)dr;
		
		WebElement from = dr.findElement(By.id("src"));
		from.sendKeys("pu");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String string = "return document.getElementById(\"src\").value";
		String city =(String) j.executeScript(string);
		
		System.out.println(city);
		while(!city.equalsIgnoreCase("Sangamwadi, Pune"))
		{
			Thread.sleep(3000);
			from.sendKeys(Keys.DOWN);
			string = "return document.getElementById(\"src\").value";
			city =(String) j.executeScript(string);
		}
		
		from.sendKeys(Keys.ENTER);
		
		WebElement dest = dr.findElement(By.id("dest"));
		dest.sendKeys("lat");
		
		String string1 = "return document.getElementById(\"dest\").value";
		String destination =(String) j.executeScript(string1);
		System.out.println(destination);
		while(!destination.equalsIgnoreCase("Gandhi Square, Latur"))
		{
			Thread.sleep(3000);
			dest.sendKeys(Keys.DOWN);
			string1 = "return document.getElementById(\"dest\").value";
			destination =(String) j.executeScript(string1);
		}
		
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		dr.findElement(By.cssSelector("input#onward_cal")).click();
		String monthyear = dr.findElement(By.cssSelector("td[class='monthTitle']")).getText();
		System.out.println(monthyear);
		
		while (!monthyear.equalsIgnoreCase("Dec 2023"))
		{
			dr.findElement(By.cssSelector("td[class='next']")).click();
			monthyear = dr.findElement(By.cssSelector("td[class='monthTitle']")).getText();
		}
		
		List<WebElement> date = dr.findElements(By.cssSelector("td[class='wd day']"));
		int size = date.size();
		for(int i=0;i<=size-1;i++)
		{
			String text = dr.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
			if(text.equalsIgnoreCase("15"))
			{
				dr.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
			}
		}
		
	}
}
