package realTimeTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
// element locator here e r going to upload file		
		WebElement findElement = d.findElement(By.id("imagesrc"));
		
//in send keys paste the file path which we want to upload		
		findElement.sendKeys("F:\\Quention.docx");

//click to open button on window to upload file 		
		d.findElement(By.name("open")).click();
	}

}
