package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		
		d.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Mahesh");
		d.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Raghu");
		d.findElement(By.cssSelector("input[name='phone']")).sendKeys("1234556");
		d.findElement(By.cssSelector("input#userName")).sendKeys("abbcss");
		d.findElement(By.cssSelector("input[name='address1']")).sendKeys("Chinchwad");
		d.findElement(By.cssSelector("input[name='city']")).sendKeys("Pune");
		d.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
		d.findElement(By.name("postalCode")).sendKeys("411019");
		WebElement findElement = d.findElement(By.cssSelector("select[name='country']"));
		Select s=new Select(findElement);
		s.selectByIndex(3);
		
		d.findElement(By.cssSelector("input#email")).sendKeys("abbcss");
		d.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		d.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("123456");
		d.findElement(By.cssSelector("input[name='submit']")).click();
		
	}
}
