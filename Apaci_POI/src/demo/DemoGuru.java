package demo;

import java.io.IOException;
import java.text.Format;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGuru extends ExcelUtil{
	
	public static WebDriver d;
	
	@BeforeSuite
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		System.out.println(rowCount()+" "+cellCount());
		
	}
	
	@BeforeMethod
	public void waits()
	{
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test()
	public void logIn(String un, String password)
	{
		d.findElement(By.cssSelector("input[name='userName']")).sendKeys(un);
		d.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		d.findElement(By.cssSelector("input[name='submit']")).click();
		d.findElement(By.linkText("SIGN-OFF")).click();
		
		d.findElement(By.cssSelector("input[name='userName']")).clear();
		d.findElement(By.cssSelector("input[name='password']")).clear();
	}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		
		
		String[][] s=new String[rowCount()][cellCount()];
		
		for(int i=0;i<rowCount();i++)
		{
			XSSFRow row = sheet1.getRow(i);
			for(int j=0;j<cellCount();j++)
			{
				XSSFCell cell = row.getCell(j);
				
				DataFormatter d=new DataFormatter();
				String value = d.formatCellValue(cell);
				 
				 s[i][j]=value;	
			}
		}
		return s;
	
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		d.quit();
	}

}
