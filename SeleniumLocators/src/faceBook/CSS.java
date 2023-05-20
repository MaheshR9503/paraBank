package faceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Java\\\\SeleniumJar\\\\Driver Jar Files\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//div[@class='_6ltg']/child ::a")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ram");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("XYZ");
		d.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("xyz01@gmail.com");
		d.findElement(By.cssSelector("input[autocomplete^='ne']")).sendKeys("abcd@1234");
		WebElement findElement = d.findElement(By.xpath("//Select[@id='year']/preceding-sibling ::*[2]"));
		Select s=new Select(findElement);
		s.selectByIndex(20);
		
		WebElement findElement2 = d.findElement(By.xpath("//Select[@id='year']/preceding-sibling ::*[1]"));
		Select s1=new Select(findElement2);
		s1.selectByIndex(6);
		
		WebElement findElement3 = d.findElement(By.xpath("//Select[@id='day']/following-sibling ::*[2]"));
		Select s2=new Select(findElement3);
		s2.selectByIndex(20);
		
		d.findElement(By.cssSelector("input._8esa[value='2']")).click();
		
		d.findElement(By.cssSelector("div._58mu a#terms-link")).click();
//		d.findElement(By.cssSelector("div._1lch :nth-child(1)")).click();
				
		
	}
}
