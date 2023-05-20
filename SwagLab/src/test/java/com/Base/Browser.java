package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Browser {
	
	protected static WebDriver driver;
	String browser;
	public Properties pr;
	FileInputStream fi;
	protected Logger lg;
	
	public Browser()
	{
		pr=new Properties();
		lg=Logger.getLogger(Browser.class.getName());
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
	
	
	public WebDriver opneBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pr.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else
			if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(pr.getProperty("url"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}else
				if(browser.equalsIgnoreCase("edge"))
				{
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
					driver.manage().window().maximize();
					driver.get(pr.getProperty("url"));
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				}
		
		return driver;
	}

}
