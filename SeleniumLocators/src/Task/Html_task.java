package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		
		d.findElement(By.xpath("//input[@id='uid']")).sendKeys("xyz");
		
		d.findElement(By.xpath("//button[@id='login']/preceding-sibling ::*[7]")).sendKeys("1234");
		
		WebElement findElement = d.findElement(By.xpath("//div[@class='container']/child ::select"));
		Select s=new Select(findElement);
		s.selectByIndex(2);

		
		d.findElement(By.xpath("//input[@id='pid']/following-sibling ::*[7]")).click();
	}
}
