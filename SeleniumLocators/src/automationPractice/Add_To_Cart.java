package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_To_Cart {
	
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://automationpractice.com/index.php");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d.findElement(By.cssSelector("a[title='Women']")).click();
		d.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li.sfHoverForce > a")).click();
		d.findElement(By.cssSelector("input#layered_id_attribute_group_1")).click();
		d.findElement(By.xpath("//a[@title='Add to cart']")).click();
		
		
		
	}
}
