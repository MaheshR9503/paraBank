package ksrtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://ksrtc.in/oprs-web/guest/home.do");
		
//		Thread.sleep(1000);
		WebElement signIn = d.findElement(By.cssSelector("a[href*='oprs-web/log']"));
		signIn.click();
		
		WebElement acc = d.findElement(By.cssSelector("a[href*='web/us']"));
		acc.click();
		
		
		WebElement email = d.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("mraghu810@gmail.com");
		
		WebElement name = d.findElement(By.cssSelector("input[name='fullName']"));
		name.sendKeys("Mahesh Raghu");
		
		WebElement mo = d.findElement(By.cssSelector("input[name='mobileNo']"));
		mo.sendKeys("9209006400");
		
		WebElement sub = d.findElement(By.xpath("//div/child ::input[@type='button']"));
		sub.submit();
		
//		System.out.println(sub.isEnabled());
//		System.out.println(d.getCurrentUrl());
//		System.out.println(d.getPageSource());
	
	}
}
