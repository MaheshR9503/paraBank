package WebTable_Static;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("file:///F:/Java/SeleniumJar/table.html");
		d.manage().window().maximize();
		
		List<WebElement> row = d.findElements(By.tagName("tr"));
		int rcount = row.size();
		System.out.println("Total row count= "+rcount);
Iterator<WebElement> itr = row.iterator();
		
		while (itr.hasNext())
		{
			WebElement r = (WebElement) itr.next();
			
			String row2 = r.getText();
			System.out.println("Row Element name= "+row2);
			List<WebElement> col = r.findElements(By.tagName("td"));
			
			for (WebElement webElement : col) 
			{
				
				System.out.println(webElement.getText());
			}
		}
		
		System.out.println(" ");
		String ele = d.findElement(By.cssSelector("tbody :nth-child(7) :nth-child(1)")).getText();
		System.out.println("Student name= "+ele);
		
		String sub = d.findElement(By.cssSelector("tbody :nth-child(7) :nth-child(2)")).getText();
		System.out.println("Name of Course= "+sub);
	}
}
