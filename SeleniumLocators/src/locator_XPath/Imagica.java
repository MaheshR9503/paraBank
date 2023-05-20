package locator_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagica {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.imagicaaworld.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//li[@id='mega-menu-item-18524']")).click();
		d.findElement(By.xpath("//img[@class='image wp-image-16973  attachment-thumbnail size-thumbnail']")).click();
		
		d.findElement(By.xpath("//img[@class=' lazyloaded']")).click();
	}
}
