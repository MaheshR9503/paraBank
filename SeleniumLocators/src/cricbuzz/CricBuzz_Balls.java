package cricbuzz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz_Balls {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		
		d.findElement(By.cssSelector("div#hm-scag-mtch-blk :nth-child(1) :nth-child(4)")).click();
		d.findElement(By.cssSelector("nav[role='navigation'] :nth-child(2)")).click();
		
		WebElement table = d.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]"));
		List<WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int rcount = rows.size();
		System.out.println("Rows in 1st inn.= "+rcount);
		int sum=0;
		for(int i=0;i<rcount-2;i++)
		{
			String b = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
			int balls = Integer.parseInt(b);
			sum=sum+balls;
			
			System.out.println("Balls faced by each player "+i +"= "+balls);
			System.out.println("Total balls in 1st inning= "+sum);
		}
		System.out.println("Total balls in 1st inning= "+sum);
		
	}
}
