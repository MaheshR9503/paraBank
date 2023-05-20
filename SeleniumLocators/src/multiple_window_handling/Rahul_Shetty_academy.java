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

public class Rahul_Shetty_academy {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		
		//total link on webPage
		List<WebElement> link = d.findElements(By.tagName("a"));
		int LinkNo = link.size();
		System.out.println("Total link on webpage="+LinkNo);
		
		//Link in footer
		WebElement flink = d.findElement(By.id("gf-BIG"));
		List<WebElement> fLinkNo = flink.findElements(By.tagName("a"));
		int flinks = fLinkNo.size();
		System.out.println("Number of footer links="+flinks);
		
		//particular link in footer
		WebElement pflinks = d.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
		List<WebElement> list = pflinks.findElements(By.tagName("a"));
		int pflNo = list.size();
		System.out.println("particular link in footer="+pflNo);
		for(int i=1;i<pflNo;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			pflinks.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(2000);
		}
		
		Set<String> wkey = d.getWindowHandles();
		List<String> al=new ArrayList<String>(wkey);
		int size = al.size();
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) 
		{
			d.switchTo().window(itr.next());
			Thread.sleep(2000);
			String title = d.getTitle();
			System.out.println(title);	
		
		}
	}
}
