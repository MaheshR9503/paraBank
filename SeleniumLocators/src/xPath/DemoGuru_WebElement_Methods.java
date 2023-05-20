package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru_WebElement_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement f = d.findElement(By.xpath("//input[@name='firstName']"));
		f.sendKeys("ABCD");
		
		WebElement Lname = d.findElement(By.xpath("//input[@name='lastName']"));
		Lname.sendKeys("XYZ");
		
		WebElement phone = d.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1234567890");
		
		WebElement id = d.findElement(By.xpath("//input[@name='userName']"));
		id.sendKeys("QQQQ");
		
		WebElement ad = d.findElement(By.xpath("//input[@name='address1']"));
		ad.sendKeys("akurdi");
		
		WebElement city = d.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Pune");
		
		WebElement state = d.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharashtra");
		
		WebElement code = d.findElement(By.xpath("//input[@name='postalCode']"));
		code.sendKeys("412362");
		
		WebElement coun = d.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(coun);
		s.selectByIndex(20);
		
		WebElement userN = d.findElement(By.xpath("//input[@name='email']"));
		userN.sendKeys("abcd@gmail.com");
		
		WebElement pas = d.findElement(By.xpath("//input[@name='password']"));
		pas.sendKeys("qqqq");
		
		WebElement conf = d.findElement(By.xpath("//input[@name='confirmPassword']"));
		conf.sendKeys("qqqq");
		
		WebElement sub = d.findElement(By.xpath("//input[@name='submit']"));
//		sub.submit();
		
		String text = state.getText();
		System.out.println(text);
		
		System.out.println(userN.isDisplayed());
		
		System.out.println(pas.isSelected());
		
		System.out.println(sub.isEnabled());
		
	}
}
