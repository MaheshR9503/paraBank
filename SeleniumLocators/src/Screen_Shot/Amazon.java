package Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");

		ChromeDriver dr=new ChromeDriver();
		dr.get("https://amazon.in");
		dr.manage().window().maximize();
	
		File amz = dr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectoryToDirectory(amz, new File("F:\\Java\\SeleniumJar\\ScreenShots\\AMazon"));
		
		dr.executeScript("scrollBy(0,700)");
	}


}
