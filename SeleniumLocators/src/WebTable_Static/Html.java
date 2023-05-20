package WebTable_Static;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		d.get("file:///F:/Java/SeleniumJar/table.html");
		d.manage().window().maximize();
		
		List<WebElement> row = d.findElements(By.tagName("tr"));
		int rcount = row.size();
		System.out.println("Total row count= "+rcount);
		
		for (WebElement r : row) 
		{
			List<WebElement> col = r.findElements(By.tagName("td"));
			
			for (WebElement c : col) 
			{
				String ele = c.getText();
				System.out.println(ele);
				
			}
			
		}
		
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
		
		
	}
}
