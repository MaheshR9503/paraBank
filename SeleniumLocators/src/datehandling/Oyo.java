package datehandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oyo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		d.get("https://www.makemytrip.com/hotels/");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		d.findElement(By.cssSelector("label[for='checkin']")).click();
		String text = d.findElement(By.cssSelector("div[class='DayPicker-Caption']")).getText();
		System.out.println(text);
		
//		String month = text.split(" ")[0].trim();
//		String year = text.split(" ")[1].trim();
//		System.out.println(month+" & "+year);
		
		while(!(d.findElement(By.xpath("//div[@class='DayPicker-Months']/child ::div[1]/child ::div[@role='heading']")).getText().contains("January")))
		{
			d.findElement(By.cssSelector("span[aria-label='Next Month']")).click();	
		}
		
		List<WebElement> al = d.findElements(By.cssSelector("div[class='DayPicker-Day DayPicker-Day--selected']"));
		int size = al.size();
		for(int i=0;i<size;i++)
		{
			String day = d.findElements(By.cssSelector("//div[@class='DayPicker-Body']/child ::div[2]/child ::div")).get(i).getText();
			
			if(day.equalsIgnoreCase("12"))
			{
				d.findElements(By.cssSelector("//div[@class='DayPicker-Body']/child ::div[2]/child ::div")).get(i).click();
			}
			
		}
		
		
	}
	
}
