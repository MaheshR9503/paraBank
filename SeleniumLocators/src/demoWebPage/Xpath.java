package demoWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();	
		d.get("https://demowebshop.tricentis.com/");
		
		 d.findElement(By.xpath("//div[@class='top-menu-triangle']/preceding-sibling ::a")).click();
		WebElement findElement = d.findElement(By.cssSelector("select#products-orderby"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		
		WebElement findElement2 = d.findElement(By.cssSelector("select[name='products-pagesize']"));
		Select s1=new Select(findElement2);
		s1.selectByIndex(0);
		
		WebElement findElement3 = d.findElement(By.cssSelector("select#products-viewmode"));
		Select s2=new Select(findElement3);
		s2.selectByIndex(1);
		
//		d.findElement(By.xpath("//a[@href='https://demowebshop.tricentis.com/books?price=25-50']")).click();
	
		d.findElement(By.xpath("//div/child ::input[@class='button-2 product-box-add-to-cart-button']")).click();
		
		d.findElement(By.xpath("//a[@class='ico-cart']/child ::*")).click();
		d.findElement(By.xpath("//span[@class='td-title']//following-sibling ::*")).click();
		d.findElement(By.xpath("//td[@class='qty nobr']/child ::input")).sendKeys("3");
		WebElement findElement4 = d.findElement(By.cssSelector("select#CountryId"));
		Select s3=new Select(findElement4);
		s3.selectByIndex(10);
		
		d.findElement(By.xpath("//select[@id='StateProvinceId']")).click();
		d.findElement(By.xpath("//input[@name='applydiscountcouponcode']/preceding-sibling ::*")).sendKeys("abgas2122");
		d.findElement(By.xpath("//div[@class='coupon-code']/child ::*[2]")).click();
		d.findElement(By.cssSelector("input[name='giftcardcouponcode']")).sendKeys("1245abg");
		d.findElement(By.xpath("//input[@value='Add gift card']")).click();
		d.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("411012");
		d.findElement(By.xpath("//input[@name='estimateshipping']")).click();
		d.findElement(By.xpath("//input[@id='termsofservice']")).click();
		d.findElement(By.xpath("//button[@id='checkout']")).click();
	
		
	}
}
