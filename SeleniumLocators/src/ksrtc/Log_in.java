package ksrtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_in {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.ksrtc.in/oprs-web/login/show.do");
		d.findElement(By.cssSelector("a[href*='web/login/s")).click();
		WebElement us = d.findElement(By.cssSelector("input#userName"));
		us.sendKeys("mraghu810@gmail.com");
		
		WebElement pass = d.findElement(By.cssSelector("input#password"));
		pass.sendKeys("Mraghu810@");
		
		d.findElement(By.cssSelector("input#submitBtn")).click();
	}
}
