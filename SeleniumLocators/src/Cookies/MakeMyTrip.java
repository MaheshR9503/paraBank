package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.makemytrip.com/railways/");
		
		Set<Cookie> cookies = d.manage().getCookies();
		
		
		int size = cookies.size();
		System.out.println(size);
		
		for (Cookie cookie : cookies) {
			
			System.out.println("---------------------------------");
			System.out.println(cookie.getName());
			System.out.println(cookie.getPath());
			System.out.println(cookie.getClass());
			System.out.println(cookie.getValue());
			System.out.println(cookie.isHttpOnly());
			System.out.println(cookie.isSecure());
		}
	
		Cookie c=new Cookie("_nhdx_", "12");
		d.manage().addCookie(c);
		
		d.manage().deleteCookie(c);		
		Set<Cookie> cookies2 = d.manage().getCookies();
		System.out.println(cookies2.size());
		
	}
}
