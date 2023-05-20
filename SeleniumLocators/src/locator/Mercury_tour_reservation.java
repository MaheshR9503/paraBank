package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_tour_reservation {

	public static void main(String[] args) {
		
		System.out.println("Tour Package");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/reservation.php");
		d.manage().window().maximize();
		
//		d.findElement(By.tagName("oneway")).click();
		
		WebElement findElement = d.findElement(By.name("passCount"));
		Select s = new Select(findElement);
		s.selectByIndex(2);
		
		WebElement fe = d.findElement(By.name("fromPort"));
		Select s1=new Select(fe);
		s1.selectByIndex(5);
		
		WebElement findElement2 = d.findElement(By.name("fromMonth"));
		Select s2 = new Select(findElement2);
		s2.selectByIndex(4);
		
		WebElement findElement3 = d.findElement(By.name("fromDay"));
		Select s3 = new Select(findElement3);
		s3.selectByValue("22");
		
		WebElement fe1 = d.findElement(By.name("toPort"));
		Select s4=new Select(fe1);
		s4.selectByIndex(5);
		
		WebElement fe2 = d.findElement(By.name("toMonth"));
		Select s5=new  Select(fe2);
		s5.selectByIndex(5);
		
		WebElement fe3 = d.findElement(By.name("toDay"));
		Select s6=new Select(fe3);
		s6.selectByValue("10");
		
		
		d.findElement(By.name("servClass")).click();
		
		WebElement findElement4 = d.findElement(By.name("airline"));
		Select s7=new Select(findElement4);
		s7.selectByIndex(1);
		
		d.findElement(By.name("findFlights")).click();
		
	
	}
	
}
