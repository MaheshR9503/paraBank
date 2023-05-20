package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTout_tag_ID {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/index.php");
		
		d.findElement(By.cssSelector("input[name='userName']")).sendKeys("QQQQ");
		d.findElement(By.cssSelector("input[name='password']")).sendKeys("qqqq");
		d.findElement(By.cssSelector("input[name='submit']")).click();
	}
}
