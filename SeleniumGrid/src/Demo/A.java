package Demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class A {
	
	public WebDriver driver;
	DesiredCapabilities cap=DesiredCapabilities.chrome();

	
	@BeforeMethod
	public void setup()
	{
		String nodeUrl="http://192.168.0.102:4444";
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
	
		ChromeOptions copt=new ChromeOptions();
		copt.merge(cap);
//		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		try {
			driver= new RemoteWebDriver(new URL(nodeUrl), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void pub() throws MalformedURLException {
		

		driver.get("https://www.amazon.in/");
	}
	
	
	@Test
	public void fb()
	{
//		System.setProperty("webdriver.edge.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\msedgedriver.exe");
//		driver= new EdgeDriver();

		driver.get("https://www.facebook.in/");
	}
	

}
