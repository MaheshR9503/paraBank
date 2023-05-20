package sibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_immeditadePrecedingSibling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		
		d.findElement(By.xpath("//button/preceding-sibling ::*[11]")).sendKeys("abcd");
		
		d.findElement(By.xpath("//button/preceding-sibling ::*[7]")).sendKeys("qqqq");
		
		WebElement findElement = d.findElement(By.xpath("//button/preceding-sibling ::*[4]"));
		Select s=new Select(findElement);
		s.selectByIndex(2);
		
		d.findElement(By.xpath("//div/child ::button")).click();
		
				
				
	}
}
