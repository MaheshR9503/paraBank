package Amazon;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	Dimension dim=new Dimension(700, 700);
	d.manage().window().setSize(dim);
	
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	}
}
