package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_Tour {

	public static void main(String[] args) {
		
		System.out.println("Welocome to Mercury Tour");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstName")).sendKeys("Mahesh");
		driver.findElement(By.name("lastName")).sendKeys("Raghu");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("userName")).sendKeys("mraghu810@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Chinchwadgaon");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("411019");
		driver.findElement(By.id("email")).sendKeys("mraghu810@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).click();
	}
}
