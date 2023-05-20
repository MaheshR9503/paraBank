package Task;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("https://www.naukri.com/");
//total links on webPage
		List<WebElement> total_Links = dr.findElements(By.tagName("a"));
		int totalLinkCount = total_Links.size();
		System.out.println("Total links on webPage= "+totalLinkCount);
		
//Header links count		
		WebElement header = dr.findElement(By.cssSelector("div[class='nI-gNb-header']"));
		List<WebElement> header_links = header.findElements(By.tagName("a"));
		int header_Link_count = header_links.size();
		System.out.println("Total links in header= "+header_Link_count);

//Total links in footer
		
		WebElement footer = dr.findElement(By.cssSelector("footer[class='nI-gNb-footer']"));
		List<WebElement> footerlinks = footer.findElements(By.tagName("a"));
		int totalFooterLinks= footerlinks.size();
		
		System.out.println("total footer links count= "+totalFooterLinks);

//particular footer links
		WebElement section1 = dr.findElement(By.xpath("//div[@class='nI-gNb-wrap']/child ::div[2]"));
		List<WebElement> section_Links = section1.findElements(By.tagName("a"));
		int total_linksInSection1 = section_Links.size();
		System.out.println("Total links in section 1= "+total_linksInSection1);
		
		for(int i=0;i<=total_linksInSection1-1;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			section1.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> windowHandles = dr.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(windowHandles);
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			dr.switchTo().window(itr.next());
			
			String title = dr.getTitle();
			System.out.println(title);
			
			if(title.equals("Info Edge (India) Limited"))
			{
				WebElement header1 = dr.findElement(By.cssSelector("div#header"));
				List<WebElement> links = header1.findElements(By.tagName("a"));
				int size = links.size();
				System.out.println("Total links in aboutUs page header = "+size);
				
			}
		}
		
		
		
		
		
		
		
	}

}
