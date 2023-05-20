package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		Actions a=new Actions(d);
		d.get("https://www.agoda.com/en-in/flights?cid=1744605&tag=59d4584b-85df-86de-ce4f-6081f6af0a6c&msclkid=6e9f1e2b26471ba1f6cb7db24b5f3fb1\r\n");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement to = d.findElement(By.id("flight-destination-search-input"));
		
		a.keyDown(to, "Mum");
		
		
		
	}	

}
