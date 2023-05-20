package multiple_window_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahul_Shetty_ {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		
		WebElement footer = d.findElement(By.xpath("//*//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
		List<WebElement> fLink = footer.findElements(By.tagName("a"));
		int size = fLink.size();
		System.out.println(size);
		for(int i=1;i<size;i++)
		{
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(chord);
			Thread.sleep(2000);
		}
		
		Set<String> wkey = d.getWindowHandles();
		List<String> s=new ArrayList<String>(wkey);
		Iterator<String> iterator = s.iterator();
		
		while (iterator.hasNext())
		{
			d.switchTo().window(iterator.next());
			String title = d.getTitle();
			System.out.println(title);
			
		
//			Enter in any webPage and perform operation				
			if(title.equalsIgnoreCase("REST API Tutorial"))
			{
				d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a")).click();
			}	
			if(title.equals("Apache JMeter - Apache JMeter™"))
			{
				d.findElement(By.xpath("/html/body/div[2]/ul[2]/li/ul/li[1]/a")).click();
			}
			if(title.equalsIgnoreCase("Appium Mobile Automation Testing from Scratch + Frameworks Tutorial | Udemy"))
			{
				d.findElement(By.xpath("//*[@id=\"u145-popper-trigger--5\"]/span")).click();
			}
			if(title.equalsIgnoreCase("The World's Most Popular API Testing Tool | SoapUI"))
			{
				d.findElement(By.xpath("//*[@id=\"form\"]/section[1]/div/div/div/div/div[1]/p[2]/a")).click();
			}
		}
		
		
	}
}
