package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/register");
		d.findElement(By.cssSelector("input#gender-male")).click();
		d.findElement(By.cssSelector("input#FirstName")).sendKeys("abcde");
		d.findElement(By.cssSelector("input[name='LastName']")).sendKeys("zzzzz");
		d.findElement(By.cssSelector("input#Email")).sendKeys("abc123@gmail.com");
		d.findElement(By.cssSelector("input#Password")).sendKeys("1234587");
		d.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("1234587");
		
		d.findElement(By.cssSelector("input#register-button")).click();
	}
}
