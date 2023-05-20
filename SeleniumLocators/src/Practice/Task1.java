package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.toolsqa.com/selenium-webdriver/selenium-headless-browser-testing/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement intr = d.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/ul/li[3]/ul/li/ul[1]"));
		
		List<WebElement> links = intr.findElements(By.tagName("a"));
		int count = links.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			intr.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> set = d.getWindowHandles();
		List<String> al=new ArrayList<String>(set);
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			String title = d.getTitle();
			System.out.println(title);
		}
		
		
	}

}
