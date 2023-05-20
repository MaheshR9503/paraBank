package datehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://ksrtc.in/oprs-web/");
		dr.executeScript("scroll(0,300)");
		
		dr.findElement(By.id("txtJourneyDate")).click();
		
//		String text = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//		String month=text.split(" ")[0].trim();
//		String year = text.split(" ")[1].trim();
		
//		System.out.println(month+" & "+year);
		
		while(!(dr.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains("December 2022")))
		{
			dr.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		List<WebElement> al = dr.findElements(By.cssSelector("td[data-handler='selectDay']"));
		
		int size = al.size();
		
		for(int i=0;i<size;i++)
		{
			String date = dr.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(date.equals("20"))
			{
				dr.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
	}

}
