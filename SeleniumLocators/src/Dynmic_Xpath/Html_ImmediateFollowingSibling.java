package Dynmic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_ImmediateFollowingSibling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		
		d.findElement(By.xpath("//label/following-sibling ::*")).sendKeys("xyza");
		d.findElement(By.xpath("//label/following-sibling ::*[5]")).sendKeys("5462");
		WebElement findElement = d.findElement(By.xpath("//label/following-sibling ::*[8]"));
		Select s=new Select(findElement);
		s.selectByIndex(2);
		
		d.findElement(By.xpath("//label/following-sibling ::*[12]")).click();
	}
}
