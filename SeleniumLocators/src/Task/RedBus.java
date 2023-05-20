package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.redbus.in/");
		dr.manage().window().maximize();
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
