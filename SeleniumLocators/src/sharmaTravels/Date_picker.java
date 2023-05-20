package sharmaTravels;

import java.security.Key;
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
import org.openqa.selenium.support.ui.Select;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.vishwatravels.in/");
		d.manage().window().maximize();
		
		Thread.sleep(5000);
		/*
		d.findElement(By.cssSelector("#fromCity_chosen > a > div > b")).click();
		WebElement from = d.findElement(By.xpath("//div[@class='chosen-drop'][1]/child ::div/child ::input[@tabindex='1']"));
		from.sendKeys("Latur");
		String chord = Keys.chord(Keys.DOWN,Keys.ENTER);
		from.sendKeys(chord);
		
		d.findElement(By.cssSelector("#toCity_chosen > a > div > b")).click();
		WebElement to = d.findElement(By.xpath("//div[@class='chosen-drop'][1]/child ::div/child ::input[@tabindex='2']"));
		to.sendKeys("Mumbai");
		String chord1 = Keys.chord(Keys.DOWN,Keys.ENTER);
		to.sendKeys(chord1);
	
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("input#departDate")).click();
		WebElement dept = d.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/child ::div/child ::div"));
		String text = dept.getText();
		System.out.println(text);
		
		String month = text.split(" ")[0].trim();
		String year = text.split(" ")[1].trim();
		System.out.println(month+" & "+year);
		
		while(!(month.equalsIgnoreCase("December") && year.equalsIgnoreCase("2022")))
				{
					d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();
					dept = d.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/child ::div/child ::div"));
					month = text.split(" ")[0].trim();
					year = text.split(" ")[1].trim();
				}
		
		List<WebElement> day = dept.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int dcount = day.size();
		System.out.println("total days= "+dcount);
		
		for(int i=0;i<dcount;i++)
		{
			String dy = dept.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			System.out.println(dy);
			if(dy.equalsIgnoreCase("15"))
			{
				dept.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
		
		
		d.findElement(By.cssSelector("input#returnDate")).click();
		WebElement retr = d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div"));
		String text2 = retr.getText();
		System.out.println(text2);
		String mon = text2.split(" ")[0].trim();
		String yr = text2.split(" ")[1].trim();
		System.out.println(mon+" & "+yr);
		
		while(!(mon.equalsIgnoreCase("December") && yr.equalsIgnoreCase("2022")))
		{
			d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-last > div > a")).click();
			retr = d.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > div > div"));
			mon = text2.split(" ")[0].trim();
			yr = text2.split(" ")[1].trim();
		}
		
		List<WebElement> rt = d.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int size = rt.size();
		for(int i=0;i<size;i++)
		{
			String tr1 = d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(tr1.equalsIgnoreCase("18"))
			{
				d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
		*/
		
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		int lcount = links.size();
		System.out.println("Toatla links= "+lcount);
		
		WebElement footer = d.findElement(By.cssSelector("div[class='footer-top']"));
		List<WebElement> flinks = footer.findElements(By.tagName("a"));
		int flcount = flinks.size();
		System.out.println("Total footer links= "+flcount);
		
		WebElement pfooter = d.findElement(By.cssSelector("#outerWrapper > div.footermain > div > div.footer-top > div:nth-child(1) > div.footer-menu"));
		List<WebElement> pflinks = pfooter.findElements(By.tagName("a"));
		int pflcount = pflinks.size();
		System.out.println("Particular footer links= "+pflcount);
		
		for(int i=0;i<pflcount;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			pfooter.findElements(By.tagName("a")).get(i).sendKeys(click);
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
		
	}
}
