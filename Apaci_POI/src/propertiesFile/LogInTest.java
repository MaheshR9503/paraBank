package propertiesFile;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class LogInTest extends File {
	
	WebDriver d;
	
	@BeforeSuite
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		 d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void waits()
	{
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@org.testng.annotations.Test
	public void logIn() throws IOException
	{
		Properties pr = data();
		pr.load(fi);
		d.findElement(By.cssSelector("input[name='userName']")).sendKeys(pr.getProperty("username"));
		d.findElement(By.cssSelector("input[name='password']")).sendKeys(pr.getProperty("password"));
		d.findElement(By.cssSelector("input[name='submit']")).click();
		d.findElement(By.linkText("SIGN-OFF")).click();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		d.quit();
	}
}
