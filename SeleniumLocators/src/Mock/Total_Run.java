package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Total_Run {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Testing pdf\\\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		
		opt.setHeadless(true);
		
		WebDriver d=new ChromeDriver(opt);
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//ul[@class='cb-col cb-col-100 videos-carousal-wrapper']/child ::li[2]")).click();
		d.findElement(By.xpath("//nav[@role='navigation']/child ::a[2]")).click();
		
		WebElement table = d.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]"));
		List<WebElement> al1 = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int size = al1.size();
		System.out.println("total rows= "+size);
		int sum=0;
		for (int i = 0; i < size-2; i++) 
		{
			String runs = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
			int r = Integer.parseInt(runs);
			sum=sum+r;
			System.out.println("total runs by player= "+sum);
				
		}
		
		String text = d.findElement(By.cssSelector("div#innings_1 div :nth-child(14) :nth-child(2)")).getText();
		int extras = Integer.parseInt(text);
		
		 int total_runs=sum+extras;
		System.out.println(total_runs);
		
		int balls=0;
		
		for (int i = 0; i < size-2; i++) 
		{
			String runs = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/child ::div[4]")).get(i).getText();
			int r = Integer.parseInt(runs);
			balls=balls+r;
			System.out.println("total runs by player= "+balls);
				
		}
		
		
		
		
		
		
		
		
		
		
	}
}
