package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Login {
	
	WebDriver d;
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		d=new ChromeDriver();
	}
	@BeforeTest
	public void openUrl()
	{
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
	
	@Test
	public void checkItems()
	{
		WebElement mobile = d.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		String string = "return document.getElementById('twotabsearchtextbox').value='mobile';";
		String x =(String) js.executeScript(string);	
		
		while(!x.equalsIgnoreCase("mobile holder for bikes"))
		{
			mobile.sendKeys(Keys.DOWN);
			string = "return document.getElementById('twotabsearchtextbox').value";
			x =(String) js.executeScript(string);
		}
		mobile.sendKeys(Keys.ENTER);
	}
	
	

}
