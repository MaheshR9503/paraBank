package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://jqueryui.com/slider/");
		dr.findElement(By.linkText("Range slider")).click();
		
		WebElement frame = dr.findElement(By.cssSelector("iframe[class='demo-frame']"));
		
		dr.switchTo().frame(frame);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement slider1 = dr.findElement(By.xpath("//div[@id='f']/child ::div"));
//		WebElement slider2 = dr.findElement(By.xpath("//div[@id='f']/child ::span[2]"));
		Actions a1=new Actions(dr);
		
		a1.dragAndDropBy(slider1, 300, 0).build().perform();
//		a1.dragAndDropBy(slider2, 300, 0).build().perform();
		
		System.out.println("slider done successfully");
	}	
}
