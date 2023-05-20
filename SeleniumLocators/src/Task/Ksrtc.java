package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://ksrtc.in/oprs-web/");
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("scroll(0,400)");
		
		WebElement from = dr.findElement(By.id("fromPlaceName"));
		from.sendKeys("bang");
		
		String s = "return document.getElementById(\"fromPlaceName\").value";
		String city=(String)js.executeScript(s);
		
		while(!city.equalsIgnoreCase("BANGALORE AIRPORT"))
		{
			Thread.sleep(1000);
			from.sendKeys(Keys.DOWN);
			s = "return document.getElementById(\"fromPlaceName\").value";
			city=(String)js.executeScript(s);
			
		}
		
		from.sendKeys(Keys.ENTER);
		
		WebElement to = dr.findElement(By.id("toPlaceName"));
		to.sendKeys("a");
		String s1 = "return document.getElementById(\"toPlaceName\").value";
		String city1=(String)js.executeScript(s1);
		
		while(!city1.equalsIgnoreCase("ATTIBELE KA BORDER"))
		{
			Thread.sleep(1000);
			to.sendKeys(Keys.DOWN);
			s = "return document.getElementById(\"fromPlaceName\").value";
			city1=(String)js.executeScript(s1);
			
		}
		
		to.sendKeys(Keys.ENTER);
		
		
		dr.findElement(By.id("txtJourneyDate")).click();
		
		String date = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(date);
		
		if(date.equalsIgnoreCase("December 2022"))
		{
			List<WebElement> date1 = dr.findElements(By.cssSelector("td[data-handler='selectDay']"));
			
			int size = date1.size();
			
			for(int i=0;i<=size;i++)
			{
				String from1 = dr.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
				
				if(from1.equalsIgnoreCase("3"))
				{
					dr.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
				}
			}
		}
		

	
	}

}
