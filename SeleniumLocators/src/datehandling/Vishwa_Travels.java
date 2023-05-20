package datehandling;

import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vishwa_Travels {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.narmadabus.com/");
		d.manage().window().maximize();
		
		d.findElement(By.cssSelector("#fromCity_chosen > a")).click();
		WebElement click = d.findElement(By.cssSelector("#fromCity_chosen > div > div > input[type=text]"));
		click.sendKeys("Pune");
		Thread.sleep(1000);
		click.sendKeys(Keys.DOWN,Keys.ENTER);
		
		d.findElement(By.cssSelector("#toCity_chosen > a")).click();
		WebElement to = d.findElement(By.cssSelector("#toCity_chosen > div > div > input[type=text]"));
		to.sendKeys("Latur");
		Thread.sleep(1000);
		to.sendKeys(Keys.DOWN, Keys.ENTER);
		
		d.findElement(By.id("departDate")).click();
		String month = d.findElement(By.cssSelector("div.ui-datepicker-title span[class='ui-datepicker-month']")).getText();
		String year = d.findElement(By.cssSelector("div.ui-datepicker-title span[class='ui-datepicker-year']")).getText();
		System.out.println(month+" "+year);
		while(!month.equalsIgnoreCase("November") && year.equalsIgnoreCase("2022"))
		{
			d.findElement(By.cssSelector("a[data-handler='next']")).click();
			 month = d.findElement(By.cssSelector("div.ui-datepicker-title span[class='ui-datepicker-month']")).getText();
			 year = d.findElement(By.cssSelector("div.ui-datepicker-title span[class='ui-datepicker-year']")).getText();
		}
		List<WebElement> days = d.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int size = days.size();
		System.out.println(size);
		
		for(int i=1;i<size;i++)
		{
			String text = d.findElements(By.cssSelector("td[data-='selectDay']")).get(i).getText();
			
			if(text.equalsIgnoreCase("22"))
			{
				d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
				
			}
			
		}
		
		d.findElement(By.cssSelector("input#returnDate")).click();
		String month1 = d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div > span.ui-datepicker-month")).getText();
		String year1 = d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > div > span.ui-datepicker-year")).getText();
		System.out.println("-------"+month1+" "+year1+"-------------");
		
		while(!month1.equalsIgnoreCase("Decemeber") && year1.equalsIgnoreCase("2022"))
		{
			d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a > span")).click();
			d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			month1 = d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div > span.ui-datepicker-month")).getText();
			year1 = d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > div > span.ui-datepicker-year")).getText();
		}
		List<WebElement> day = d.findElements(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(3) > td:nth-child(3)"));
		int size2 = day.size();
		System.out.println(size2);
		for(int i=1;i<size2;i++)
		{
			String text = d.findElements(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(3) > td:nth-child(3)")).get(i).getText();
			if(text.equalsIgnoreCase("10"))
			{
				d.findElements(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(3) > td:nth-child(3)")).get(i).click();
				
			}
		}
		d.findElement(By.cssSelector("div.search input[type='submit']")).click();
		File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("F:\\Java\\SeleniumJar\\ScreenShots\\AMazon\n.jpg"));
	}
}
