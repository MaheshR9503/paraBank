package multiple_window_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		 WebDriver d=new ChromeDriver();
		 
		 d.get("https://www.redbus.in/");
		 
		 d.manage().window().maximize();
		 WebElement footer = d.findElement(By.xpath("//*[@id=\"rh_footer\"]/div[3]"));
		 
		 List<WebElement> fLinks = footer.findElements(By.tagName("a"));
		 int lCount = fLinks.size();
		 System.out.println(lCount);
		 
		 WebElement pflink = d.findElement(By.xpath("//*[@id=\"rh_footer\"]/div[3]/div/div/div[1]/div[1]"));
		 List<WebElement> al = pflink.findElements(By.tagName("a"));
		 int pflcount = al.size();
		 System.out.println(pflcount);
		 
		 for(int i=1;i<pflcount;i++)
		 {
			 String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 pflink.findElements(By.tagName("a")).get(i).sendKeys(click);
			 Thread.sleep(2000);
			
		 }
		 Set<String> windowHandles = d.getWindowHandles();
		 List<String> al1=new ArrayList<String>(windowHandles);
		 System.out.println(al.size());
		 
		 Iterator<String> itr1 = al1.iterator();
		 while(itr1.hasNext())
		 {
			 d.switchTo().window(itr1.next());
			 String title = d.getTitle();
			 System.out.println(title);
			 
			 if(title.equalsIgnoreCase("sitemap"))
			 {
				 System.out.println("Sitemap");
				 d.findElement(By.xpath("//*[@id=\"root\"]/div/article[1]/div[2]/ul/li[1]/a")).click();
				 
			 }
		 }
		 
//		 Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India
//		 redBus value
//		 redBus Careers
//		 Offers: Bus Offers & Coupon Codes | Grab Discount on Bus Booking
//		 sitemap
//
//		 Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India
//		 Customer Support, 24X7 Customer Service -redBus.in
		 
		 
		 
	
	}
}
