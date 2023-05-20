package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books");
		
		d.manage().window().maximize();
		
//		d.findElement(By.id("glow-ingress-line2")).click();
//		d.findElement(By.partialLinkText("or enter an Indian")).sendKeys("411019");
//		d.findElement(By.className("a-button-input")).click();
		
//		d.findElement(By.tagName("submit")).click();
		
		d.findElement(By.className("icp-nav-language")).click();
	}
}
