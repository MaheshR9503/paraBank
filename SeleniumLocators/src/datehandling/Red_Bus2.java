package datehandling;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.redbus.in/");
		d.manage().window().maximize();
		
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.id("src")).sendKeys("Pune");
		WebElement x = d.findElement(By.cssSelector("li[data-id='67159']"));

		d.findElement(By.id("dest")).sendKeys("Nagpur");
		d.findElement(By.cssSelector("li[data-id='624']")).click();

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
		File amz = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(amz, new File("F:\\Java\\SeleniumJar\\ScreenShots\\demo\\date.jpg"));
	}
}
