package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		 
		 WebDriver d=new ChromeDriver();
		 
		 d.get("https://demowebshop.tricentis.com/register");
		 
		 d.findElement(By.xpath("//div/child ::input[@id='gender-male']")).click();
		 d.findElement(By.xpath("//div/child ::input[@id='FirstName']")).sendKeys("Ram");
		 d.findElement(By.xpath("//div/child ::input[@id='LastName']")).sendKeys("aaaa");
		 d.findElement(By.xpath("//div/child ::input[@name='Email']")).sendKeys("mraghu810@gmail.com");
		 
		 d.findElement(By.xpath("//span[@data-valmsg-for='Password']/preceding-sibling ::*[2]")).sendKeys("123456");
		 d.findElement(By.xpath("//span[@data-valmsg-for='ConfirmPassword']/preceding-sibling ::*[2]")).sendKeys("123456");
		d.findElement(By.xpath("//div/child ::input[@type='submit']")).click();
//		d.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
}
