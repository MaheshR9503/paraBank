package WebTable_Static;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bowlers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.cricbuzz.com/");
		
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']/child ::ul/child ::li[4]/child ::a")).click();
		d.findElement(By.xpath("//nav[@role='navigation']/child ::a[2]")).click();
		
		WebElement table = d.findElement(By.xpath("//div[@id='innings_1']/child ::div[4]"));
		
		List<WebElement> al = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms '] :nth-child(4)"));
		int size = al.size();
		int sum=0;
		for(int i=0;i<size;i++)
		{
			String text = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms '] :nth-child(4)")).get(i).getText();
			int parseInt = Integer.parseInt(text);
			
			sum=sum+parseInt;
			
			System.out.println("Total run by each bowlers= "+sum);
			
		}
		
	}
}
