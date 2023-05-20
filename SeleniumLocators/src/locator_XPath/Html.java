package locator_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("file:///F:/Java/SeleniumJar/index.html");
	
	d.findElement(By.xpath("//div/child :: input[@id='uid']")).sendKeys("QQQQ");
	d.findElement(By.xpath("//div/child :: input[@type='password']")).sendKeys("qqqq");
	WebElement findElement = d.findElement(By.xpath("//div/child :: select[@id='browser']"));
	Select s=new Select(findElement);
	s.selectByIndex(1);
	
	d.findElement(By.xpath("//button/parent ::div/child :: input[@name='uname']")).sendKeys("abcd");
	
	d.findElement(By.xpath("//button/parent ::div/child :: button[@type='submit']")).click();
}
}
