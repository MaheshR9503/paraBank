package Array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
		

	
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing pdf\\chromedriver.exe");
		
	WebDriver dr=new ChromeDriver();
	
	dr.get("https://www.cricbuzz.com/live-cricket-scorecard/56717/1st-test-new-zealand-tour-of-pakistan-2022-23");
		
		WebElement table = dr.findElement(By.xpath("//div[@id='innings_2']/child ::div[1]"));
		
		
		List<WebElement> row = table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));
		int size = row.size();
		System.out.println(size);
		
		for (int i = 0; i <size; i++) {
			
			String text = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/child ::div[3]")).get(i).getText();
			
			System.out.println(text);
		}
		
	//	System.out.println("text");
	}

}
