package cricbuzz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Run {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Testing pdf\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
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
		
		
		
	}
}
