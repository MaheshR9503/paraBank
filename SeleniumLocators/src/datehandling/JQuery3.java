package datehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		  d.findElement(By.cssSelector("input#datepicker")).click();
		  
		  String monthYear = d.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
		  System.out.println(monthYear);
		  String Month = monthYear.split(" ")[0].trim();
		  String Year = monthYear.split(" ")[1].trim();
		  
		  while(!(Month.equalsIgnoreCase("May") && Year.equalsIgnoreCase("2025")))
		  {
			  d.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
			   monthYear = d.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
			   Month = monthYear.split(" ")[0].trim();
			   Year = monthYear.split(" ")[1].trim();
		  }
		  
		  List<WebElement> days = d.findElements(By.cssSelector("td[data-handler='selectDay']"));
		  int size = days.size();
		  System.out.println(size);
		  
		  for(int i=0;i<size;i++)
		  {
			  String day1 = d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			  if(day1.equalsIgnoreCase("22"))
			  {
				  d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			  }
		  }
		  
	}
}
