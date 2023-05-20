package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions a=new Actions(d);
		WebElement element = d.findElement(By.cssSelector("#container > div > div._331-kn._2tvxW > div > div > div:nth-child(5) > a > div._1mkliO > div > img"));
		a.click(element);
		
		WebElement login = d.findElement(By.xpath("//a[@class='_1_3w1N']"));
		a.moveToElement(login);
	}
}
