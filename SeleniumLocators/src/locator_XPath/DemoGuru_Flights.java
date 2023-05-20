package locator_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru_Flights {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@value='oneway']")).click();
		
		WebElement findElement = d.findElement(By.xpath("//select[@name='passCount']"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		
		WebElement findElement2 = d.findElement(By.xpath("//select[@name='fromPort']"));
		Select s1=new Select(findElement2);
		s1.selectByIndex(2);
		
		WebElement findElement3 = d.findElement(By.xpath("//select[@name='fromMonth']"));
		Select s2=new Select(findElement3);
		s2.selectByIndex(8);
		
		WebElement findElement4 = d.findElement(By.xpath("//select[@name='fromDay']"));
		Select s3=new Select(findElement4);
		s3.selectByIndex(20);
		
		WebElement findElement5 = d.findElement(By.xpath("//select[@name='toPort']"));
		Select s4=new Select(findElement5);
		s4.selectByIndex(3);
		
		WebElement findElement6 = d.findElement(By.xpath("//select[@name='toMonth']"));
		Select s5=new Select(findElement6);
		s5.selectByIndex(3);
		
		WebElement findElement7 = d.findElement(By.xpath("//select[@name='toDay']"));
		Select s6=new Select(findElement7);
		s6.selectByIndex(22);
		
		d.findElement(By.xpath("//input[@value='Business']")).click();
		
		WebElement findElement9 = d.findElement(By.xpath("//select[@name='airline']"));
		Select s8=new Select(findElement9);
		s8.selectByIndex(1);
		
		d.findElement(By.xpath("//input[@name='findFlights']")).click();
		
				
		
		
	}
}
