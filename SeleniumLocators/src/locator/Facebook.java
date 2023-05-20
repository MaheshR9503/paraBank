package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("mraghu810@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Mraghu810@");
		
		driver.findElement(By.name("login")).click();
		
//		driver.findElement(By.tagName("image")).click();
		
		driver.findElement(By.xpath("//li[@class='cgu29s5g spg2eblf pf0ji5sa lukx7821 btkph1az jbg88c62 q8kr2fb9']/child ::*[1]")).click();
		//driver.findElement(By.)
		
		//driver.close();
		
	
	}
}
