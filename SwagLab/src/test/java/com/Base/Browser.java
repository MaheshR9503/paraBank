package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Browser {
	
	protected static WebDriver driver;
	String browser;
	public Properties pr;
	FileInputStream fi;
	
	public Browser()
	{
		pr=new Properties();
		try {
			fi=new FileInputStream("F:\\Java\\SeleniumJar\\SeleniumPrograms\\Day3-Locators\\SwagLab\\src\\test\\resources\\broserData.properties");
			
			pr.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public WebDriver opneBrowser()
	{
		if(pr.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pr.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		return driver;
	}

}
