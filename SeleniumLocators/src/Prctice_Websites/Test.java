package Prctice_Websites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://jpetstore.aspectran.com/account/newAccountForm");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("title of page is = "+dr.getTitle());
		System.out.println(dr.getPageSource());
		System.out.println(dr.getCurrentUrl());
		dr.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		dr.navigate().back();
		dr.navigate().refresh();
		
		
		
		
		
		WebElement logo = dr.findElement(By.cssSelector("div.title-bar-left a img"));
		boolean disply = logo.isDisplayed();
		System.out.println("is logo present on register page?  = "+disply);
		
		WebElement userName = dr.findElement(By.name("username"));
		userName.sendKeys("AbcXyz125");
		int height = userName.getSize().height;
		int width = userName.getSize().getWidth();
		String text = userName.getText();
		
		userName.getLocation();
	
		
		System.out.println("Usename elemnt text= "+text);
		System.out.println("Height of Element is= "+height+" & width is= "+width);
		
		dr.findElement(By.cssSelector("input[name='password']")).sendKeys("aaaaa");
		dr.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("aaaaa");
		dr.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mahesh");
		dr.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raghu");
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("abdcd23@gmail.com");
		dr.findElement(By.xpath("//input[@name='phone']")).sendKeys("9209006400");
		dr.findElement(By.xpath("//input[@name='address1']")).sendKeys("nr stadium");
		dr.findElement(By.xpath("//input[@name='address2']")).sendKeys("chinchwad");
		dr.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		dr.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		dr.findElement(By.xpath("//input[@name='zip']")).sendKeys("413555");
		dr.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
		WebElement lang = dr.findElement(By.name("languagePreference"));
		Select s=new Select(lang);
		s.selectByIndex(2);
		
		WebElement category = dr.findElement(By.name("favouriteCategoryId"));
		
		Select s1=new Select(category);
		s1.selectByValue("REPTILES");
		
		WebElement list = dr.findElement(By.xpath("//input[@name='listOption']"));
		boolean displayed = list.isDisplayed();
		System.out.println("is Element displayed on page?  Ans= "+displayed);
		
		list.click();
		dr.findElement(By.xpath("//input[@name='bannerOption']")).click();
		dr.findElement(By.xpath("//div[@class='button-bar']/child ::button")).click();
		
		Thread.sleep(3000);
		
		dr.quit();
		
		
	}

}
