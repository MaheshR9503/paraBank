package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/login");
		
		d.findElement(By.xpath("//input[@class='email']")).sendKeys("raghumahesh77@gmail.com");
		d.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		d.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
}
