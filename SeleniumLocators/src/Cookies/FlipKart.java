package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		d.get("https://flipkart.com/");
		d.manage().window().maximize();
		
		Set<Cookie> cookies = d.manage().getCookies();
		int size = cookies.size();
		System.out.println(size);
		
		for (Cookie cookie : cookies) 
		{
			System.out.println("---------------------------------------");
			String name = cookie.getName();
			System.out.println(name);
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getValue());
		}
		
		Cookie add=new Cookie("_122", "sxjn");
		d.manage().addCookie(add);
	}
}
