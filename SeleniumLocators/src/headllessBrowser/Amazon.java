package headllessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Testing pdf\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver dr=new ChromeDriver(options);
		
		dr.get("https://www.amazon.in/");
		
		System.out.println(dr.getTitle());
		
		
		
	}

}
