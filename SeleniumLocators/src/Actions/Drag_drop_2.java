package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://uitestpractice.com/Students/Actions");
		d.manage().window().maximize();
		
		Actions a=new Actions(d);
		
		WebElement click = d.findElement(By.cssSelector("button[name='click']"));
		a.click(click).build().perform();
		d.switchTo().alert().accept();
		
		WebElement dbc = d.findElement(By.cssSelector("button[name='dblClick']"));
		a.doubleClick(dbc).build().perform();
		d.switchTo().alert().accept();
		
		WebElement mh = d.findElement(By.cssSelector("div#div2"));
		Thread.sleep(3000);
		a.moveToElement(mh).build().perform();
		
		WebElement dr = d.findElement(By.cssSelector("div#draggable"));
		WebElement dp = d.findElement(By.cssSelector("div#droppable"));
		
		a.dragAndDrop(dr, dp).build().perform();
		
		WebElement one = d.findElement(By.cssSelector("li[name='one']"));
		a.click(one).build().perform();
		
		WebElement frm = d.findElement(By.cssSelector("iframe#aswift_0"));
		d.switchTo().frame(frm);
		
		d.findElement(By.cssSelector("a#details-link")).click();
		d.switchTo().defaultContent();
	}
}
