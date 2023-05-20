package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		d.manage().window().maximize();
		
		WebElement prime = d.findElement(By.id("nav-link-amazonprime"));
		Actions a=new Actions(d);
		
		a.moveToElement(prime).build().perform();
		
		WebElement ele = d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
		a.click(ele).build().perform();
		
//		Thread.sleep(2000);
		WebElement book = d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
		a.doubleClick(book);
	}
}
