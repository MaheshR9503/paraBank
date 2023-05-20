package Frame_handling;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Capabilities;

public class Automaion_testing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.demoblaze.com/index.html");
		d.manage().window().maximize();
		
		d.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait w=new WebDriverWait(d, Duration.ofSeconds(10));
		
		
		WebElement laptop = d.findElement(By.cssSelector("div[class='list-group'] :nth-child(3)"));
		Dimension height = laptop.getRect().getDimension();
		System.out.println(height.height);
		System.out.println(height.width);
		int x = laptop.getRect().getPoint().x;
		int y = laptop.getRect().getPoint().y;
		System.out.println(x+"&"+y);
		
	
		
//		w.until(ExpectedConditions.visibilityOf(laptop)).click();
		
		
		WebElement mac = d.findElement(By.cssSelector("div#tbodyid :nth-child(6) :nth-child(1) div h4 a"));
		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fw.until(ExpectedConditions.visibilityOf(mac)).click();
		
		
		
		
//		d.switchTo().newWindow()
	}
}
