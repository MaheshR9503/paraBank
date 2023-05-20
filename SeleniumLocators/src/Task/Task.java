package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///F:/Java/SeleniumJar/index.html");
		
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='uid']")).sendKeys("QQQQ");
		d.findElement(By.xpath("//select/preceding-sibling ::*[3]")).sendKeys("qqqq");
		d.findElement(By.xpath("/html/body/form/div[1]/label/input")).click();
		d.findElement(By.xpath("//input[@id='pid']/following-sibling ::*[7]")).click();
	}
	
}
