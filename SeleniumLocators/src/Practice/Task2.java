package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vishwatravels.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity_chosen")).click();
		WebElement from = driver.findElement(By.xpath("//*[@id=\"fromCity_chosen\"]/div/div/input"));
		from.sendKeys("pune");
		
		String click = Keys.chord(Keys.DOWN,Keys.ENTER);
		from.sendKeys(click);
		
		driver.findElement(By.id("departDate")).click();
		String text = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		while(!text.equalsIgnoreCase("March 2023"))
		{
			driver.findElement(By.cssSelector("a[title='Next']")).click();
		}
		
		
		List<WebElement> al = driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int size = al.size();
		
		
		for(int i=0;i<size;i++)
		{
			String date = driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			
			if(date.equalsIgnoreCase("20"))
			{
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
		
		
	}

}
