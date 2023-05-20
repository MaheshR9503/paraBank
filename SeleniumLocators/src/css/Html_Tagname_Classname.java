package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_Tagname_Classname {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		d.findElement(By.cssSelector("input,username")).sendKeys("jeet");
		d.findElement(By.cssSelector("input[type='password']")).sendKeys("15555");
		WebElement findElement = d.findElement(By.cssSelector("select[id='browser']"));
		Select s=new Select(findElement);
		s.selectByIndex(2);
		
		d.findElement(By.cssSelector("button[id='login']")).click();
	}
}
