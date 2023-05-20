package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		
		System.out.println("Welcome to youTube");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		
		d.manage().window().maximize();
		
		d.findElement(By.name("search_query")).sendKeys("Pune ganapati");
		//d.findElement(By.className("style-scope ytd-searchbox")).click();
		d.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		
	}
}
