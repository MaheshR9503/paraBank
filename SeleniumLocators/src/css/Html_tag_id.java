package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_tag_id {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("file:///F:/Java/SeleniumJar/index.html");
		
		d.findElement(By.cssSelector("input#uid")).sendKeys("kkkk");
		d.findElement(By.cssSelector("input#pid")).sendKeys("8888");
		WebElement findElement = d.findElement(By.cssSelector("select#browser"));
		Select s=new Select(findElement);
		s.selectByIndex(2);
		
		d.findElement(By.cssSelector("button#login")).click();
	}
}
