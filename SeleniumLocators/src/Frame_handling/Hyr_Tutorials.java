package Frame_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hyr_Tutorials {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		Actions a=new Actions(d);
		
		
		d.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebElement frame1 = d.findElement(By.cssSelector("iframe#frm2"));
		d.switchTo().frame(frame1);
		
		d.findElement(By.id("firstName")).sendKeys("mahesh");
		d.findElement(By.cssSelector("input#lastName")).sendKeys("abcd");
		d.findElement(By.cssSelector("input#malerb")).click();
		d.findElement(By.cssSelector("input#englishchbx")).click();
		d.findElement(By.cssSelector("input#chinesechbx")).click();
		d.findElement(By.id("email")).sendKeys("abcd12@gmail.com");
		d.switchTo().defaultContent();
		
		WebElement fr3 = d.findElement(By.id("frm3"));
		d.switchTo().frame(fr3);
		
		WebElement sel = d.findElement(By.cssSelector("select#selectnav1"));
		Select s=new Select(sel);
		s.selectByIndex(1);
		
		d.findElement(By.cssSelector("input#name")).sendKeys("123");
		WebElement fr1 = d.findElement(By.id("frm1"));
		d.switchTo().frame(fr1);
		
		WebElement sele = d.findElement(By.cssSelector("select#course"));
		Select s1=new Select(sele);
		s1.selectByIndex(1);
		
		d.switchTo().defaultContent();
	}
}
