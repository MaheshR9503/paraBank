package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.co.in/");
	d.findElement(By.name("q")).sendKeys("Youtube");
	
}
}
