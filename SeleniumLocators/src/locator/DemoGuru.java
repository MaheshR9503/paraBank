package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.name("userName"));
		
		uname.sendKeys("QQQQ");
		
		uname.findElement(By.name("password")).sendKeys("qqqq");
		driver.findElement(By.name("submit")).click();
		
	}

}
