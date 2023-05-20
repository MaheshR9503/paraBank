package WebTable_Static;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cribzzz {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		
		d.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']/child ::ul/child ::li[2]/child ::a")).click();
		d.findElement(By.xpath("//nav[@role='navigation']/child ::a[2]")).click();
		WebElement table = d.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]"));
		List<WebElement> al = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int size = al.size();
		System.out.println("total rows= "+size);
		
		int sum=0;
		for(int i=0;i<size-3;i++)
		{
			String run = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
			int r = Integer.parseInt(run);
			
			sum=sum+r;
			System.out.println("Total runs by player= "+sum);
		}
		String text = table.findElement(By.cssSelector("div#innings_1 :nth-child(1) :nth-child(11) :nth-child(2)")).getText();
		int extra = Integer.parseInt(text);
		int total=sum+extra;
		System.out.println("Total runs= "+total);
		
		
	}
}
