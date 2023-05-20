package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        System.setProperty("webdriver.chrome.driver","F:\\Testing pdf\\chromedriver.exe");
         
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
         
        WebDriver driver = new ChromeDriver(options);
 
        driver.get("https://ksrtc.in/oprs-web/");
        System.out.println("Executing Firefox Driver in Headless mode..\n");
 
        System.out.println(">> Page Title : "+driver.getTitle());
             System.out.println(">> Page URL  : "+driver.getCurrentUrl());
             
             
    }
 

}
