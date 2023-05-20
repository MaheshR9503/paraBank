package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css_Selecter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://automationpractice.com/index.php");
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("a[class ='login']")).click();
		d.findElement(By.cssSelector("input#email_create")).sendKeys("xzy987@gmail.com");
		d.findElement(By.cssSelector("button#SubmitCreate")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("span input#id_gender1")).click();
		d.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("ABCD");
		d.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("wxyz");
		d.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
		WebElement days = d.findElement(By.cssSelector("select#days"));
		Select s=new Select(days);
		s.selectByIndex(20);
		
		WebElement mon = d.findElement(By.cssSelector("select#months"));
		Select s1=new Select(mon);
		s1.selectByIndex(4);
		
		WebElement year = d.findElement(By.cssSelector("select#years"));
		Select s2=new Select(year);
		s2.selectByIndex(26);
		
		d.findElement(By.cssSelector("input#optin")).click();
		d.findElement(By.cssSelector("input#firstname")).sendKeys("ABCD");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("PQRS");
		d.findElement(By.cssSelector("input#company")).sendKeys("XYZ");
		d.findElement(By.cssSelector("input[name='address1']")).sendKeys("Link Road");
		d.findElement(By.cssSelector("input[name='address2']")).sendKeys("Narmada apartment, chinchwad");
		d.findElement(By.cssSelector("input#city")).sendKeys("Pune");
		WebElement findElement = d.findElement(By.cssSelector("select#id_state"));
		Select s3=new Select(findElement);
		s3.selectByIndex(10);
		
		d.findElement(By.cssSelector("input#postcode")).sendKeys("411012");
		d.findElement(By.cssSelector("textarea#other")).sendKeys("Hello");
		d.findElement(By.cssSelector("input#phone")).sendKeys("220-221222");
		d.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("9209006400");
		d.findElement(By.xpath("//input[@name='alias']")).sendKeys("Pune");
		d.findElement(By.xpath("//button[@name='submitAccount']")).click();
		
	}
}
