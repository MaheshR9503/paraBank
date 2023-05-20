package datehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Datepicker.html");
		d.findElement(By.cssSelector("input#datepicker1")).click();
		d.findElement(By.xpath("//a[@title='Next']")).click();
//		WebElement yearMonth = d.findElement(By.cssSelector("//*[@id=\"ui-datepicker-div\"]/div"));
//		String yrMon = yearMonth.getText();
//		System.out.println(yrMon);
//		String month = yrMon.split(" ")[0].trim();
//		String year=yrMon.split(" ")[1].trim();
//		while(!d.findElement(By.xpath("//div[@id='ui-datepicker-div']/child ::div")).getText().contains("December"))
//		{
//			d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
//			yrMon = yearMonth.getText();
//			month = yrMon.split(" ")[0].trim();
//			year=yrMon.split(" ")[1].trim();
//		}
		
		List<WebElement> al = d.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int size = al.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text = d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("25"))
			{
				d.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}	
	}

}
