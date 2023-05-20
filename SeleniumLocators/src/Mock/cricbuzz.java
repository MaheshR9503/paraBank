package Mock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.cricbuzz.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//ul[@class='cb-col cb-col-100 videos-carousal-wrapper']/child ::li[2]")).click();
		dr.findElement(By.xpath("//nav[@role='navigation']/child :: a[2]")).click();
		
		
		WebElement table = dr.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]"));
		List<WebElement> al = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		int size = al.size();
		System.out.println(size);
		int r=0;
		
		for(int i=0;i<size;i++)
		{
			String text = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
			
			int parseInt = Integer.parseInt(text);
			
			r=r+parseInt;
			
			
		}
			System.out.println("Total runs by players= "+r);
	}

}
