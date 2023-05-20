package WebTable_Static;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		d.get("https://www.cricbuzz.com/");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("#hm-scag-mtch-blk > ul > li:nth-child(4)")).click();
		d.findElement(By.cssSelector("nav[role='navigation'] :nth-child(2)")).click();
		String text = d.findElement(By.cssSelector("div#innings_1 :nth-child(1) :nth-child(1)")).getText();
		System.out.print(text);
		System.out.println();
		
		String Player = d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-of-type(1)")).getText();
		System.out.println("Name of Player= "+Player);
		
		String balls = d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-of-type(4)")).getText();
		System.out.println("Total balls faced by "+Player+"= "+balls);
		
		String runs = d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-of-type(3)")).getText();
		System.out.println("Run Scored by "+Player+"= "+runs);
		
		String six = d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-of-type(6)")).getText();
		System.out.println("No. of six hit by "+Player+"= "+six);
		
		String sr=d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-of-type(7)")).getText();
		System.out.println("Strick rate of "+Player+"= "+sr);
		
		String extra = d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr'] :nth-of-type(10) :nth-child(2)")).getText();
		System.out.println("Extra runs in inning-1= "+extra);
		
		String total_Run=d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr'] :nth-of-type(11) :nth-child(2)")).getText();
		System.out.println("Total runs Scored in Inning-1= "+total_Run);
		
		List<WebElement> record = d.findElements(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(4)"));
	
		Iterator<WebElement> itr = record.iterator();
		while (itr.hasNext()) {
			WebElement webElement = (WebElement) itr.next();
			String text2 = webElement.getText();
			System.out.println(text2);
		}
		
		
		
	}
}
