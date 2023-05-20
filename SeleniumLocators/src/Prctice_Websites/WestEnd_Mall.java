package Prctice_Websites;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WestEnd_Mall {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		Actions a=new Actions(d);
		
		d.get("https://www.westendmallpune.com/");
		d.manage().window().maximize();
		
		WebElement m = d.findElement(By.cssSelector("#menu-main-menu-1 > li.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-has-children.menu-item-1155.menu-item-level0.have-child.wd-fly-menu.parent"));
		
		a.moveToElement(m).build().perform();
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("#menu-main-menu-1 > li.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-has-children.menu-item-1155.menu-item-level0.have-child.wd-fly-menu.parent > ul > li.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-2020.menu-item-level1.wd-fly-menu > a")).click();
//		d.findElement(By.cssSelector("#\\31 490873194240-7e040f38-60ff > div.vc_tta-panel-body > div:nth-child(1) > div:nth-child(3) > div > div > div > a")).click();
		
		WebElement links = d.findElement(By.id("1490873194240-7e040f38-60ff"));
		List<WebElement> list = links.findElements(By.tagName("a"));
		int lcount = list.size();
		System.out.println(lcount);
		
		WebElement row = d.findElement(By.cssSelector("#\\31 490873194240-7e040f38-60ff > div.vc_tta-panel-body > div:nth-child(1)"));
		List<WebElement> link = row.findElements(By.tagName("a"));
		int lcount1 = link.size();
		System.out.println(lcount1);
		
		Set<Cookie> c = d.manage().getCookies();
		int size = c.size();
		System.out.println("total cookies count= "+size);
		
		for (Iterator iterator = c.iterator(); iterator.hasNext();) 
		{
			Cookie cookie = (Cookie) iterator.next();
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.isHttpOnly());
			System.out.println(cookie.isSecure());
			System.out.println(cookie.getExpiry());
		}
			
		
//		for(int i=1;i<lcount1;i++)
//		{
//			String click = Keys.chord(Keys.ENTER);
//			row.findElements(By.tagName("a")).get(i).sendKeys(click);
//			String title = d.getTitle();
//			System.out.println("Title of links= "+title);
//			d.navigate().to("https://www.westendmallpune.com/brands/#1490873194240-7e040f38-60ff");
//		}
		
	
		
	}
}
