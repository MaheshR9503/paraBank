package multiple_window_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> al = dr.findElements(By.tagName("a"));
		int size = al.size();
		System.out.println("Total links on webPage= "+size);
		
		WebElement footer = dr.findElement(By.id("gf-BIG"));
		
		List<WebElement> al1 = footer.findElements(By.tagName("a"));
		int size2 = al1.size();
		System.out.println("Total footer links= "+size2);
		
		WebElement pflinks = dr.findElement(By.xpath("//table[@class='gf-t']/child ::tbody/child ::tr/child ::td[2]"));
		List<WebElement> al2 = pflinks.findElements(By.tagName("a"));
		int pflcount = al2.size();
		System.out.println("Particular footer links= "+pflcount);
		
		for(int i=0;i<pflcount;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			pflinks.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(2000);
		}
		
		Set<String> set = dr.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(set);
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) 
		{
			dr.switchTo().window(itr.next());
			String title = dr.getTitle();
			System.out.println(title);
			
			
			
			
		}
		
	}
}
