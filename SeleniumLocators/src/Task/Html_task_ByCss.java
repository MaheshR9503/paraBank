package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_task_ByCss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		
		d.findElement(By.cssSelector("input[class^='us']")).sendKeys("abcd");
		d.findElement(By.cssSelector("div input[type^='pas']")).sendKeys("98765");
		d.findElement(By.cssSelector("input[id='remem']")).click();
		d.findElement(By.cssSelector("div.container :nth-child(13)")).click();
//		d.findElement(By.xpath("a[href$='ss']")).click();
	}
}
