
package multiple_window_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NarmDaTravels {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.narmadabus.com/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scroll(0,800)");
		
		WebElement footer = d.findElement(By.className("footermain"));
		List<WebElement> al = footer.findElements(By.tagName("a"));
		int totalFooterLinks = al.size();
		System.out.println("Total footer links= "+totalFooterLinks);
		
		WebElement pfooter = d.findElement(By.xpath("//div[@class='footermain']/child ::div/child ::div[2]"));
		List<WebElement> pflink = pfooter.findElements(By.tagName("a"));
		int pfcount = pflink.size();
		System.out.println("Toatal links in particular footer section= "+pfcount);
		for(int i=0;i<pfcount;i++)
		{
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			pfooter.findElements(By.tagName("a")).get(i).sendKeys(chord);
			Thread.sleep(2000);
		}
		
		Set<String> windowHandles = d.getWindowHandles();
		ArrayList<String> al2=new ArrayList<String>(windowHandles);
		Iterator<String> itr = al2.iterator();
		
		while (itr.hasNext()) {
			d.switchTo().window(itr.next());
			String title = d.getTitle();
			
			System.out.println(title);
			
		}
		
		
		
		
		
		
	}
}
