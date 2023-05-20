package Prctice_Websites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scroll(0,1500)");
		
//		Actions a=new Actions(d);
//		WebElement m = d.findElement(By.cssSelector("a[ng-mouseover='vm.readyToShow = true']"));
//		a.moveToElement(m).build().perform();
//		
//		WebElement l = d.findElement(By.cssSelector("#navBarMegaNav > li:nth-child(6) > a"));
//		a.click().build().perform();
//		
//		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		d.findElement(By.cssSelector("#dynamicDirective > carousel-only-image:nth-child(2) > section > section > div:nth-child(3) > div > div > a.ng-scope")).click();
		
		
		WebElement footer = d.findElement(By.cssSelector("div[class='container footer-links']"));
		List<WebElement> flinks = footer.findElements(By.tagName("a"));
		int fcount = flinks.size();
		System.out.println("total footer links= "+fcount);
		
		WebElement p = d.findElement(By.cssSelector("body > div.body-wrap > div:nth-child(21) > footer > div.container.footer-links > div:nth-child(2)"));
		List<WebElement> plinks = p.findElements(By.tagName("a"));
		int pcount = plinks.size();
		System.out.println("particulat links count= "+pcount);
		
		for(int i=0;i<pcount;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			p.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		Set<String> windowHandles = d.getWindowHandles();
		List<String> al=new ArrayList<String>(windowHandles);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			String title = d.getTitle();
			System.out.println(title);
		}
		
		Set<Cookie> cookies = d.manage().getCookies();
		int size = cookies.size();
		System.out.println("Total cookies number= "+size);
		
		for (Cookie cookie : cookies)
		{
			System.out.println(" ");
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getName());
			System.out.println(cookie.getPath());
			System.out.println(cookie.getClass());
			System.out.println(cookie.getExpiry());
			
		}
		
		Cookie c=new Cookie("_azjs", "151515");
		d.manage().addCookie(c);
	}
}
