package cricbuzz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bowlers {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']/child ::ul/child ::li[4]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//nav[@role='navigation']/child ::a[2]")).click();
	//	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement table = d.findElement(By.xpath("//div[@id='innings_1']/child ::div[4]"));
		List<WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms ']"));
		int r = rows.size();
		System.out.println("total rows= "+r);
		
		for(int i=0;i<r;i++)
		{
			String r1 = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms '] :nth-child(4)")).get(i).getText();
			int runs = Integer.parseInt(r1);
			System.out.println(runs);
		}
		
		
	}
}
