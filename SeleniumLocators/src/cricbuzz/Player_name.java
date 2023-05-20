package cricbuzz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Player_name {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']/child ::ul/child ::li[3]")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("nav[role='navigation'] :nth-child(2)")).click();
		
		WebElement table = d.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]"));
		List<WebElement> al = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int rows = al.size();
		System.out.println(rows);
		
		for(int i=0; i<rows-2;i++)
		{
			String names = table.findElements(By.cssSelector("div#innings_2 div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(1) a")).get(i).getText();
			System.out.println("Players name= "+names);
			
				if(names.equalsIgnoreCase("Manish Pandey"))
				{
				String wicket = table.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]/child ::div[7]/child ::div[2]/child ::span")).getText();
				String ballFaced = table.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]/child ::div[7]/child ::div[4]")).getText();
				String run = table.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]/child ::div[7]/child ::div[3]")).getText();
				String fours = table.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]/child ::div[7]/child ::div[5]")).getText();
				String six = table.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]/child ::div[7]/child ::div[6]")).getText();
				String sr = table.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]/child ::div[7]/child ::div[7]")).getText();
				
				System.out.println("Player "+names+"out by "+wicket+" scored "+run+" in "+ballFaced+" balls with stricket rate "+sr+". He hits "+fours+" fours and "+six+" sixes");
				}
		}
		
	}
}
