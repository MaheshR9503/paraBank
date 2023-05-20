package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Purchase {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/");
		WebElement x = d.findElement(By.cssSelector("i[class='hm-icon nav-sprite']"));
		x.click();
//		Thread.sleep(2000);
		d.findElement(By.cssSelector("a[data-menu-id='8'] i[class='nav-sprite hmenu-arrow-next']")).click();
		d.findElement(By.xpath("//ul[@data-menu-id='8']/child ::*[3]/child ::a")).click();
		Thread.sleep(2000);
//		d.findElement(By.xpath("div#s-refinements :nth-child(6) :nth-child(2)")).click();
		d.findElement(By.cssSelector("li#sobe_d_b_2_1 a div img")).click();
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("a[title='Oppo A54 (Starry Blue, 6GB RAM, 128GB Storage) with No Cost EMI & Additional Exchange Offers']")).click();
		Thread.sleep(2000);
		WebElement findElement = d.findElement(By.cssSelector("select#quantity"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		d.findElement(By.cssSelector("input[name='submit.add-to-cart']")).submit();
	}
}
