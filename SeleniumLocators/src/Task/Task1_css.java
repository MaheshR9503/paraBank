package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1_css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		d.findElement(By.cssSelector("input[name^='un']")).sendKeys("QQQQ");
		d.findElement(By.cssSelector("div input[id='pid']")).sendKeys("qqqq");
		WebElement findElement = d.findElement(By.cssSelector("select[id*='ow']"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		
		d.findElement(By.cssSelector("input[type='checkbox']")).click();
		d.findElement(By.cssSelector("div.container :nth-child(13)")).click();
//		d.findElement(By.cssSelector("a[href$='pass']")).click();
	}
}
