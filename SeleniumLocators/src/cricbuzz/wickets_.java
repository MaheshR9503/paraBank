package cricbuzz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wickets_ {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']/child ::ul/child ::li[1]/child ::a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//nav[@role='navigation']/child ::a[2]")).click();
		WebElement table = d.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]"));
		List<WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int rcount = rows.size();
		System.out.println("total rows i 2nd inn.= "+rcount);
		int sum=0;
		for(int i=0;i<rcount-3;i++)
		{
			String four = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
			int f = Integer.parseInt(four);
			sum=sum+f;
			System.out.println("Boundries by player "+i+" in 2 inn.= "+f);
			System.out.println("Total fours in 2nd inn.= "+sum);
		}
		
		
	}
}
