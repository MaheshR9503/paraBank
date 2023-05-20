package Prctice_Websites;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_hotels {

	private static final String String = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://in.hotels.com/");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		d.findElement(By.cssSelector("button[aria-label='Going to']")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dest = d.findElement(By.id("destination_form_field"));
		dest.sendKeys("new");
		String city = "return document.getElementById(\"destination_form_field\").value";
		String s = (String)js.executeScript(city);
		System.out.println("name of input= "+s);
		
		while(!s.equalsIgnoreCase("New Forest National Park"))
		{
			dest.sendKeys(Keys.DOWN);
			city = "return document.getElementById(\"destination_form_field\").value";
			s = (String)js.executeScript(city);
			dest.sendKeys(Keys.ENTER);
		}
		
		
		/*Thread.sleep(2000);
		
		d.findElement(By.cssSelector("button#date_form_field-btn")).click();
		String yearMonth = d.findElement(By.cssSelector("div[class='uitk-date-picker-month'] h2[class='uitk-date-picker-month-name uitk-type-medium']")).getText();
		System.out.println(yearMonth);
		String month = yearMonth.split(" ")[0].trim();
		String year = yearMonth.split(" ")[1].trim();
		while(!month.equalsIgnoreCase("december") && year.equalsIgnoreCase("2022"))
		{
			d.findElement(By.cssSelector("#lodging_search_form > div > div > div:nth-child(2) > div > div > div > div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap > div > div.uitk-calendar > div.uitk-layout-flex.uitk-layout-flex-justify-content-space-between.uitk-date-picker-menu-pagination-container > button:nth-child(2)")).click();
			month = yearMonth.split(" ")[0].trim();
			year = yearMonth.split(" ")[1].trim();
		}
		
		List<WebElement> days = d.findElements(By.cssSelector("td[class='uitk-date-picker-day-number']"));
		int dcount = days.size();
		System.out.println(dcount);
		
		for(int i=0;i<dcount;i++)
		{
			String day = d.findElements(By.cssSelector("td[class='uitk-date-picker-day-number']")).get(i).getText();
			
			if(day.equalsIgnoreCase("4"))
			{
				d.findElements(By.cssSelector("td[class='uitk-date-picker-day-number']")).get(i).click();
			}
			
//			if(day.equalsIgnoreCase("6"))
//			{
//				d.findElements(By.cssSelector("td[class='uitk-date-picker-day-number']")).get(i).click();
//			}
		}*/
		
		/*List<WebElement> Links = d.findElements(By.tagName("a"));
		int lcount = Links.size();
		System.out.println("total links on webPage= "+lcount);
		
		WebElement footer = d.findElement(By.cssSelector("#app-layer-base > div.uitk-grid.pageWhiteBackground > div.uitk-cell.Storefront-Homepage > div.uitk-spacing.uitk-spacing-padding-block-three.uitk-spacing-padding-inlinestart-two.uitk-spacing-padding-inlineend-two > footer > div"));
		List<WebElement> flinks = footer.findElements(By.tagName("a"));
		int fcount = flinks.size();
		System.out.println("Total links in footer= "+fcount);
		
		WebElement particulaLinks = d.findElement(By.cssSelector("#app-layer-base > div.uitk-grid.pageWhiteBackground > div.uitk-cell.Storefront-Homepage > div.uitk-spacing.uitk-spacing-padding-block-three.uitk-spacing-padding-inlinestart-two.uitk-spacing-padding-inlineend-two > footer > div > div > ul.uitk-typelist.uitk-typelist-orientation-stacked.uitk-typelist-size-2.uitk-spacing.uitk-spacing-padding-blockend-two.uitk-layout-flex-item.uitk-layout-flex-item-flex-basis-full_width > li:nth-child(3)"));
		List<WebElement> plinks = particulaLinks.findElements(By.tagName("a"));
		int plcount = plinks.size();
		System.out.println("particular links in div= "+plcount);
		for(int i=0;i<plcount;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			particulaLinks.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<java.lang.String> w = d.getWindowHandles();
		List<String> al=new ArrayList<String>(w);
		
		Iterator<java.lang.String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			System.out.println(d.getTitle());
		}
		
		Set<Cookie> cookies = d.manage().getCookies();
		int cookieCount = cookies.size();
		System.out.println("Total cookies= "+cookieCount);
		
		for (Iterator itr1 = cookies.iterator(); itr1.hasNext();) 
		{
			Cookie cookie = (Cookie) itr1.next();
			
			System.out.println(" ");
			System.out.println(cookie.getName());
			System.out.println(cookie.getExpiry());
			System.out.println(cookie.isHttpOnly());
			System.out.println(cookie.isSecure());
		}
		
		File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("F:\\Java\\SeleniumJar\\ScreenShots\\AMazon\\h.jpg"));
		*/
		
		
	}
}
