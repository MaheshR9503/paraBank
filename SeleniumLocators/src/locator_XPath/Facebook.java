package locator_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome to facebook");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/login");
		
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("mraghu810@gmail.com");
		Thread.sleep(100);
		
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd123@");
		
		d.findElement(By.xpath("//button[@value='1']")).click();
//		Thread.sleep(100);
//		d.findElement(By.tagName("image")).click();
//		Thread.sleep(100);
		
		d.findElement(By.xpath("//li[@class='cgu29s5g spg2eblf pf0ji5sa lukx7821 btkph1az jbg88c62 q8kr2fb9']")).click();

		
	}
}
