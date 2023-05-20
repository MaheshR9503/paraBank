package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_automationTestting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/child ::input[@placeholder='First Name']")).sendKeys("abc");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("xyz");
		d.findElement(By.tagName("textarea")).sendKeys("Keshav Nagar,ChinchwadGaon");
		d.findElement(By.cssSelector("input[type='email']")).sendKeys("abc566@gmail.com");
		d.findElement(By.cssSelector("div input[type='tel']")).sendKeys("12535562625");
		d.findElement(By.cssSelector("input[value='Male']")).click();
		d.findElement(By.xpath("//label[@class='checks']/preceding-sibling ::input[@id='checkbox1']")).click();
//		WebElement lang = d.findElement(By.cssSelector("div#msdd"));
//		Select s=new Select(lang);
//		s.selectByIndex(10);
		
		WebElement skill = d.findElement(By.cssSelector("select#Skills"));
		Select s1=new Select(skill);
		s1.selectByIndex(10);
		
//		WebElement coun = d.findElement(By.xpath("//select[@id='countries']"));
//		Select s2=new Select(coun);
//		s2.selectByValue("India");
	
//		 d.findElement(By.cssSelector("span[class='select2-dropdown select2-dropdown--below'] input")).sendKeys("India");
		
		
		 WebElement yr = d.findElement(By.cssSelector("select#yearbox"));
		 Select s5=new Select(yr);
		 s5.selectByValue("1990");
		 
		 WebElement mon = d.findElement(By.cssSelector("select[placeholder='Month']"));
		 Select sel=new Select(mon);
		 sel.selectByIndex(10);
		 
		 WebElement day = d.findElement(By.cssSelector("select#daybox"));
		 Select sele=new Select(day);
		 sele.selectByIndex(20);
		 
		 d.findElement(By.id("firstpassword")).sendKeys("123456");
		 d.findElement(By.id("secondpassword")).sendKeys("123456");
		 d.findElement(By.cssSelector("button#Button1")).click();
		
		
	
		
		
		
	}
}
