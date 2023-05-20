package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Imagica {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		
		d.get("https://www.imagicaaworld.com/");
		d.findElement(By.id("mega-menu-item-18524")).click();
		d.findElement(By.cssSelector(".wp-image-16973")).click();
		d.findElement(By.className("mega-menu-link")).click();
		
//		d.findElement(By.id("mega-menu-item-18527")).click();
//		d.findElement(By.cssSelector("div.cta:nth-child(7)")).click();
		
		
		
	}
}
