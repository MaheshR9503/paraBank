package multiple_window_handling;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_bus2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		d.get("https://www.redbus.in/");
		d.manage().window().maximize();
		
		WebElement links = d.findElement(By.xpath("//*[@id=\"rh_footer\"]/div[1]"));
		List<WebElement> list = links.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println("total footer links="+size);
		
		WebElement l1 = d.findElement(By.xpath("//*[@id=\"rh_footer\"]/div[1]/div/div/div[1]"));
		List<WebElement> findElements = l1.findElements(By.tagName("a"));
		int size2 = findElements.size();
		System.out.println(size2);
		
		for(int i=1;i<size2;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			d.findElements(By.tagName("a")).get(i).sendKeys(click);
			System.out.println("For loop ends");
		}
		
		Set<String> windowHandles = d.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowHandles);
		ListIterator<String> itr = al.listIterator();
		while(itr.hasNext())
		{
			d.switchTo().window(itr.next());
			String title = d.getTitle();
			System.out.println(title);
//			Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India
//			red:Care
//			redRail - Book Train Travel, Online Ticket Booking App
//			Ryde: Car Rentals, Mini Buses, Bus Rentals & Tempo Traveller on Rent
//			Online Bus Tickets Booking: Book Bus Ticket and Bus Reservation -redBus India
			
			System.out.println("If_else Start");
			if(title.equalsIgnoreCase("red:Care"))
			{
				System.out.println("--------------------------------------");
				d.findElement(By.cssSelector("i[class='icon-close']")).click();
				d.findElement(By.xpath("//*[@id=\"rh_header\"]/div/div/div[2]/div[3]/div/a")).click();
				System.out.println("----------------------------------------");
			}
			else 
			{
				if(title.equalsIgnoreCase("Ryde: Car Rentals, Mini Buses, Bus Rentals & Tempo Traveller on Rent"))
				{
					System.out.println("click on Ryde page");
					d.findElement(By.xpath("//*[@id=\"Edit_Crossbutton\"]")).click();
					d.findElement(By.xpath("//*[@id=\"reactContentMount\"]/div/div[5]/div/div/div[3]/div[1]/div")).click();
					System.out.println("------------Else End-------------");
				}
			}
			
		}
		
		d.navigate().to("https://www.redbus.in/");
		System.out.println("Back to home page");
	}
}
