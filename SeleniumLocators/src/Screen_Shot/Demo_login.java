package Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_login {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.findElement(By.name("userName")).sendKeys("QQQQ");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqq");
		d.findElement(By.cssSelector("input[name='submit']")).click();
		
		File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("F:\\Java\\SeleniumJar\\ScreenShots\\demo\\login.jpg"));
		
	}
}
