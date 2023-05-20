package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_class_attri_Value {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/register");
		
		d.findElement(By.cssSelector("div.gender :nth-child(1)")).click();
		d.findElement(By.cssSelector("input[name*='rstN']")).sendKeys("Ram");
		d.findElement(By.cssSelector("div input[name^='La']")).sendKeys("Patil");
		d.findElement(By.cssSelector("div.inputs input#Email")).sendKeys("rampatil8112@gmail.com");
		d.findElement(By.cssSelector("input[id^='Pas']")).sendKeys("234568");
		d.findElement(By.cssSelector("div.inputs input#ConfirmPassword")).sendKeys("234568");
		d.findElement(By.cssSelector("div.buttons :nth-child(1)#register-button")).click();
		d.findElement(By.cssSelector("li a.ico-logout")).click();

		
		d.findElement(By.cssSelector("li a[class='ico-login']")).click();
		d.findElement(By.cssSelector("div.inputs :nth-child(2)#Email")).sendKeys("rampatil8112@gmail.com");
		d.findElement(By.cssSelector("div.inputs :nth-child(2)[name='Password']")).sendKeys("234568");
		d.findElement(By.cssSelector("input[id^='Rem']")).click();
		
		d.findElement(By.cssSelector("div.buttons input[type='submit']")).click();
		d.findElement(By.cssSelector("li a.ico-logout")).click();
	}
}
