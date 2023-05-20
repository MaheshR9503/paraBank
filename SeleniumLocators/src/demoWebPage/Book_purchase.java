package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_purchase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.cssSelector("li a[href*='boo']")).click();
		WebElement findElement = d.findElement(By.cssSelector("div select#products-orderby"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		
		WebElement findElement2 = d.findElement(By.cssSelector("Select[name*='page']"));
		Select s1=new Select(findElement2);
		s1.selectByIndex(0);
		
		WebElement findElement3 = d.findElement(By.cssSelector("Select[name$='ode']"));
		Select s2=new Select(findElement3);
		s2.selectByIndex(0);
		
		d.findElement(By.cssSelector("div.buttons input[value='Add to cart']")).click();
		d.findElement(By.cssSelector("a.ico-cart")).click();
		d.findElement(By.cssSelector("td.remove-from-cart :nth-child(2)")).click();
//		d.findElement(By.cssSelector("input[class='qty-input valid']")).sendKeys("5");
		d.findElement(By.cssSelector("div.coupon-code input[name^='dis']")).sendKeys("abcd123");
		d.findElement(By.cssSelector("div.coupon-code input[name^='gi']")).sendKeys("klma235");
		WebElement findElement4 = d.findElement(By.cssSelector("select,country-input valid"));
		Select s3=new Select(findElement4);
		s3.selectByIndex(11);
		
		d.findElement(By.cssSelector("input#ZipPostalCode")).sendKeys("411012");
		d.findElement(By.cssSelector("div.terms-of-service input")).click();
	//	d.findElement(By.cssSelector("div.checkout-buttons :nth-child(2)")).click();
				
	}
}
