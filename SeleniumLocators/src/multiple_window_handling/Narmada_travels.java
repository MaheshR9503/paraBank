package multiple_window_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Narmada_travels {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.narmadabus.com/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scroll(0,800)");
		
		WebElement footer = d.findElement(By.cssSelector("div[class='footer-wrapper']"));
		List<WebElement> flinks = footer.findElements(By.tagName("a"));
		int size = flinks.size();
		System.out.println("total footer links= "+size);
		
		WebElement pfl = d.findElement(By.cssSelector("#outerWrapper > div.footermain > div.footer-wrapper > div:nth-child(1)"));
		List<WebElement> pfolink = pfl.findElements(By.tagName("a"));
		int lcount = pfolink.size();
		System.out.println(lcount);
		
		for(int i=0;i<lcount;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			pfl.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		
		Set<String> set = d.getWindowHandles();
		List<String> al=new ArrayList<String>(set);
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			String title = d.getTitle();
			System.out.println(title);
			
			if(title.equalsIgnoreCase("- 100% Real Time Bus Tickets Booking Service"))
			{
				d.findElement(By.cssSelector("#midcontent > div:nth-child(1) > div > h1:nth-child(2) > a")).click();
			
				Thread.sleep(4000);
				d.navigate().to("http://www.narmadabus.com/");
			}
		}
		
		
	}
}
