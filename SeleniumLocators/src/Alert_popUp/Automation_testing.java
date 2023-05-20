package Alert_popUp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Automation_testing {

	static WebDriver d;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		String nodeURL="http://192.168.0.101:6460/wd/hub";
		
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		 d=new RemoteWebDriver(new URL(nodeURL),cap);
	
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("a[href='#OKTab']")).click();
		d.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		d.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		d.findElement(By.cssSelector(" button[onclick='confirmbox()']")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.switchTo().alert().dismiss();
		
		d.findElement(By.cssSelector("a[href='#Textbox']")).click();
		d.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
		d.switchTo().alert().sendKeys("Mahesh");
		String text = d.switchTo().alert().getText();
		
		
		d.switchTo().alert().sendKeys(text)
		
		System.out.println(text);
	}
}
