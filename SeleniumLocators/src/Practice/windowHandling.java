package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		WebElement footer = driver.findElement(By.className("nI-gNb-footer"));
		List<WebElement> footerlinks = footer.findElements(By.tagName("a"));
		
		int linkCount = footerlinks.size();

		System.out.println(linkCount);
		
		WebElement section1 = driver.findElement(By.xpath("//div[@class='nI-gNb-anchorList']/child ::div/child ::div[2]"));
		List<WebElement> links = section1.findElements(By.tagName("a"));
		
		int sectionLinks = links.size();
		
		System.out.println(sectionLinks);
		
		for(int i=0;i<sectionLinks;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			section1.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		
		Set<String> set = driver.getWindowHandles();
		
		List<String> al=new ArrayList<String>(set);
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			String title = driver.getTitle();
			
			System.out.println(title);
			
		}
		
	}

}
