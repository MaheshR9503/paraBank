package Prctice_Websites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniPune {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.unipune.ac.in/");
		d.manage().window().maximize();
		
		WebElement header = d.findElement(By.cssSelector("body > table > tbody > tr:nth-child(4) > td"));
		List<WebElement> hLinks = header.findElements(By.tagName("a"));
		int size = hLinks.size();
		System.out.println("Total header links= "+size);
	
//		String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
//		header.findElement(By.cssSelector("body > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > strong > a:nth-child(3)")).sendKeys(click);
	
		for(int i=0;i<size;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			header.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> windowHandles = d.getWindowHandles();
		List<String> al=new ArrayList<String>(windowHandles);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			System.out.println(d.getTitle());
			
		}
		
		Thread.sleep(2000);
		Set<Cookie> cookies = d.manage().getCookies();
		int size2 = cookies.size();
		System.out.println(size2);
		
		for (Cookie cookie : cookies) 
		{
			System.out.println(" ");
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getExpiry());
		}
		
	}
}
