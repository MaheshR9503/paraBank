package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mahesh");
		d.findElement(By.xpath("//td/child ::input[@name='lastName']")).sendKeys("Raghu");
		d.findElement(By.xpath("//td/child ::input[@name='phone']")).sendKeys("1234567890");
		d.findElement(By.xpath("//input[@name='userName']")).sendKeys("raghumahesh@gmail.com");
		d.findElement(By.xpath("//input[@name='address1']")).sendKeys("AKurdi");
		d.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		d.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		d.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411012");
		WebElement findElement = d.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(findElement);
		s.selectByIndex(10);
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("QQQQ");
		d.findElement(By.xpath("//td/child ::input[@name='password']")).sendKeys("qqqq");
		d.findElement(By.xpath("//td/child ::input[@name='confirmPassword']")).sendKeys("qqqq");
		d.findElement(By.xpath("//td/child ::input[@name='submit']")).click();
	}
}
