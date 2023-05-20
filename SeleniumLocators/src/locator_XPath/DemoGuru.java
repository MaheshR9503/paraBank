package locator_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='userName']")).sendKeys("QQQQ");
		
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqq");
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
