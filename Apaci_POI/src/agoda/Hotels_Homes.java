package agoda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotels_Homes {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.agoda.com");

		
//		boolean enabled = d.findElement(By.linkText("Overnight Stays")).isEnabled();
		
		
		WebElement ip = d.findElement(By.cssSelector("input#textInput"));
		ip.sendKeys("Mum");
		
		String city="return document.getElementById(\"textInput\").value";
		
		String location =(String) d.executeScript(city);
		System.out.println(location);
		Thread.sleep(3000);
		WebElement win = d.findElement(By.xpath("//div[@class='Popup__content']/child ::ul"));
		List<WebElement> al = win.findElements(By.tagName("li"));
		int size = al.size();
		System.out.println(size);
		
		for (WebElement webElement : al) {
			
			String names = webElement.getText();
			
			if(names.equalsIgnoreCase("Malabar Hill, Mumbai"))
			{
				win.click();
				break;
			}
			
			
		}
		
  }	

}
