package css;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("abcd");
		d.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("xyz");
		d.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Pune");
		d.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("abcd12@gmail.com");
		d.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("9209006400");
		d.findElement(By.cssSelector("input[value='Male']")).click();
		WebElement skill = d.findElement(By.cssSelector("select#Skills"));
		Select s=new Select(skill);
		s.selectByIndex(5);
		d.findElement(By.cssSelector("b[role='presentation']")).click();
		d.findElement(By.cssSelector("input[type='search']")).sendKeys("India");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("ul#select2-country-results")).click();

	}
}
