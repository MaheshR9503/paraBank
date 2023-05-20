package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public WebDriver driver;
	public Properties pr;
	public FileInputStream fis;
	String propertyFile_path="F:\\Java\\SeleniumJar\\SeleniumPrograms\\Day3-Locators\\ParaBank\\src\\main\\resources\\Properties\\Cofig.properties";
	public BaseClass()
	{
		try {
			fis=new FileInputStream(propertyFile_path);
			pr= new Properties();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public WebDriver openBrowser(String browser)
	{
		
		if(browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		
		}
		else {
			if(browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			
			else {
				if(browser.equalsIgnoreCase("chrome")) {
					
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
			}
		}
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
