package Dynmic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoguru {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//td/child :: input[@name='firstName']")).sendKeys("Mahesh");
		
		d.findElement(By.xpath("//td/child :: input[@name='lastName']")).sendKeys("Raghu");
		
		d.findElement(By.xpath("//td/child :: input[@name='phone']")).sendKeys("123456789");
		
		d.findElement(By.xpath("//td/child :: input[@id='userName']")).sendKeys("abcd");
		
		d.findElement(By.xpath("//td/child :: input[@name='address1']")).sendKeys("Keshav Nagar");
		
		d.findElement(By.xpath("//td/child :: input[@name='city']")).sendKeys("Pune");
		d.findElement(By.xpath("//td/child ::input[@name='state']")).sendKeys("Maharashtra");
		
		d.findElement(By.xpath("//td/child ::input[@name='postalCode']")).sendKeys("123456");
		WebElement findElement = d.findElement(By.xpath("//td/child ::select[@name='country']"));
		Select s=new Select(findElement);
		s.selectByIndex(3);
		
		d.findElement(By.xpath("//td/child ::input[@name='email']")).sendKeys("abcd");
		d.findElement(By.xpath("//td/child ::input[@name='password']")).sendKeys("123456");
		d.findElement(By.xpath("//td/child ::input[@name='confirmPassword']")).sendKeys("123456");
		d.findElement(By.xpath("//td/child ::input[@name='submit']")).click();
	}
}
