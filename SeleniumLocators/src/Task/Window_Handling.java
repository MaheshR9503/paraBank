package Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		d.get("http://www.narmadabus.com/");
		d.manage().window().maximize();
		//Total linnks on webPage
		List<WebElement> totalLinks = d.findElements(By.tagName("a"));
		int size = totalLinks.size();
		System.out.println("total Link on WebPAge= "+size);
		
		//total links in footer
		WebElement footer = d.findElement(By.className("footer-wrapper"));
		List<WebElement> fLinks = footer.findElements(By.tagName("a"));
		int fl = fLinks.size();
		System.out.println("total Footer Links= "+fl);
		
		//Particular links in footer
		
		WebElement pfl = d.findElement(By.xpath("//*[@id=\"outerWrapper\"]/div[3]/div[1]/div[1]"));
		List<WebElement> pflinks = pfl.findElements(By.tagName("a"));
		int pfcount = pflinks.size();
		System.out.println("Total links= "+pfcount);
		
		for(int i=1; i<pfcount;i++)
		{
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			pfl.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		
		Set<String> windowHandles = d.getWindowHandles();
		List<String> al=new ArrayList<String>(windowHandles);
		int wSize = al.size();
		System.out.println(wSize);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			System.out.println(d.getTitle());
		}
		
		
	}
}
