package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.agoda.com/en-in/flights?cid=1744605&tag=59d4584b-85df-86de-ce4f-6081f6af0a6c&msclkid=6e9f1e2b26471ba1f6cb7db24b5f3fb1\r\n");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement from = d.findElement(By.id("flight-origin-search-input"));
//		from.sendKeys("Mum");
//		
//		
//		String string = "return document.getElementById('flight-origin-search-input').value";
//		
//		String city =(String) d.executeScript(string);
//		
//		while(!city.equalsIgnoreCase("Mumbai"))
//		{
//			Thread.sleep(2000);
//			from.sendKeys(Keys.DOWN);
//			string = "return document.getElementById('flight-origin-search-input').value";
//			city =(String) d.executeScript(string);
//		}
//		from.sendKeys(Keys.ENTER);
//		
		WebElement to = d.findElement(By.id("flight-destination-search-input"));
		
		String string2 = "return document.getElementById('flight-destination-search-input').value='Tri';";
		String city2 =(String) d.executeScript(string2);		
		while(!city2.equalsIgnoreCase("Thiruvananthapuram (TRV)"))
		{
			to.sendKeys(Keys.DOWN);
			string2 = "return document.getElementById('flight-destination-search-input').value";
			city2 =(String) d.executeScript(string2);
		}
		to.sendKeys(Keys.ENTER);
	
	}

}
