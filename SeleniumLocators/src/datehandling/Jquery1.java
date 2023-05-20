package datehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://jqueryui.com/");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("a[href='http://jqueryui.com/datepicker/']")).click();

		d.switchTo().frame(0);
		d.findElement(By.cssSelector("input#datepicker")).click();
		
		while(!d.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("January"))
		{
			System.out.println("------------");
			d.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> day = d.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int size = day.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String text = d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("29"))
			{
				d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
			
			
		}
		
		
	}
}
