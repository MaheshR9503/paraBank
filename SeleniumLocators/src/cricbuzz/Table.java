package cricbuzz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		d.findElement(By.cssSelector("div#hm-scag-mtch-blk :nth-child(1) :nth-child(4)")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//nav[@role='navigation']/child ::a[2]")).click();
		WebElement table = d.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]"));
		List<WebElement> row = table.findElements(By.cssSelector("//div[@id='innings_2']/child ::div[1]/child ::div"));
		int rcount = row.size();
		System.out.println("total rows= "+rcount);
	}
}
