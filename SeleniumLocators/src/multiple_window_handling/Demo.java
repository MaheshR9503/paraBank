package multiple_window_handling;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> totalLinks = d.findElements(By.tagName("a"));
		
		int linkCount = totalLinks.size();
		
		System.out.println("Total Links on webPage= "+linkCount);
		
		WebElement frame = d.findElement(By.id("courses-iframe"));
		
		d.switchTo().frame(frame);
		
		WebElement section = d.findElement(By.xpath("//div[@class='nav-outer clearfix']"));
		
		List<WebElement> links = section.findElements(By.tagName("a"));
		int linkCounts = links.size();
		
		System.out.println(linkCounts);
		
		for(int i=0;i<linkCounts-1;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			section.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		
	}

}
