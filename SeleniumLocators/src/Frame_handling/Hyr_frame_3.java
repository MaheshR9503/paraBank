package Frame_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyr_frame_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		d.manage().window().maximize();
		WebElement fr3 = d.findElement(By.id("frm3"));
		d.switchTo().frame(fr3);
		
		WebElement fr1 = d.findElement(By.id("frm1"));
		d.switchTo().frame(fr1);
		
		WebElement findElement = d.findElement(By.cssSelector("select#course"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		
		d.switchTo().defaultContent();
		
		WebElement fe2 = d.findElement(By.id("frm2"));
		d.switchTo().frame(fe2);
		
		d.findElement(By.id("firstName")).sendKeys("abcd");
		d.findElement(By.id("lastName")).sendKeys("xyz");
		d.findElement(By.id("spanishchbx")).click();
		d.switchTo().defaultContent();
		
		d.switchTo().defaultContent();
	}
}
