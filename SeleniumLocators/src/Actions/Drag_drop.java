package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://javascript.info/mouse-drag-and-drop");
	
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement frame = d.findElement(By.xpath("//iframe[@class='code-tabs__result']"));
		d.switchTo().frame(frame);
		WebElement source = d.findElement(By.xpath("//*[@id=\"ball\"]"));
		WebElement target = d.findElement(By.xpath("//*[@id=\"gate\"]"));
		//a.dragAndDrop(source, target).build().perform();
		a.clickAndHold(source).build().perform();
		a.clickAndHold(target).release().build().perform();
		
		
		d.switchTo().defaultContent();
		
	
	}

}
