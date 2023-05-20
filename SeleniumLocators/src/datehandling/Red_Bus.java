package datehandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Red_Bus {

	public static void main(String[] args) {
		
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
		
		String text = d.findElement(By.cssSelector("div#rb-calendar_onward_cal tr[class='rb-monthHeader']")).getText();
		System.out.println(text);
		
		while(!d.findElement(By.cssSelector("div#rb-calendar_onward_cal tr[class='rb-monthHeader']")).getText().contains("Sept"));
		{
			System.out.println("-------------");
			d.findElement(By.cssSelector("td[class='next']")).click();
		}
		
		List<WebElement> day = d.findElements(By.cssSelector("td[class='wd day']"));
		int size = day.size();
		System.out.println(size);
		
		for(int i=0; i<size;i++)
		{
			String text1 = d.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
			
			if(text1.equalsIgnoreCase("20"))
			{
				d.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
			}
		}
		
		d.findElement(By.id("search_btn")).click();
		
		
	
		
	}
}



