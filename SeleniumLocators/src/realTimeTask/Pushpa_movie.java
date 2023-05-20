package realTimeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pushpa_movie {

	public WebDriver d;

	String imbd_ReleaseDate;
	String imbd_countryName;

	String wiki_releaseDate;
	String wiki_countryName;
	SoftAssert s = new SoftAssert();

	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\SeleniumJar\\Driver Jar Files\\chromedriver.exe");
		d = new ChromeDriver();

	}

	@Test(priority = 1, description = "IMBD date and country time")
	public void iMBD() {
		d.get("https://www.imdb.com/title/tt9389998/");
		imbd_ReleaseDate = d.findElement(By.xpath(
				"//section[@cel_widget_id='StaticFeature_Details']/child ::div[2]/child ::ul/child ::li[1]/child ::div/child ::ul/child ::li"))
				.getText();
		// String date = imbd_ReleaseDate.split(" ")[0].trim();
		System.out.println("release date on IMBD= " + imbd_ReleaseDate);
		imbd_countryName = d.findElement(By.xpath(
				"//section[@cel_widget_id='StaticFeature_Details']/child ::div[2]/child ::ul/child ::li[2]/child ::div/child ::ul/child ::li/child ::a"))
				.getText();
		System.out.println("imbd country name= " + imbd_countryName);
	}

	
	
	  @Test(priority = 2,description = "Wikipedia date and country time get here")
	  public void wikiPedia() { d.switchTo().window(WindowType.TAB);
	  d.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise"); wiki_releaseDate =
	  d.findElement(By.
	  xpath("//table[@class='infobox vevent']/child ::tbody/child ::tr[12]/child ::td/child ::div"
	  )).getText();
	 
	 
	  
	  System.out.println("wiki release date="+wiki_releaseDate);
	  
	  wiki_countryName = d.findElement(By.
	  xpath("//table[@class='infobox vevent']/child ::tbody/child ::tr[14]/child ::td"
	  )).getText();
	  System.out.println("wikipedia country name= "+wiki_countryName); }
	 
	@Test(priority = 3, description = "Check for Assertion")
	public void assert_toCheck_country() {

		// SoftAssert s=new SoftAssert();
		s.assertEquals(imbd_countryName, wiki_countryName, "Country name must be same Test will be pass");

		Assert.assertEquals(imbd_ReleaseDate, wiki_releaseDate, "If release date not matched test will fail");

	}

}
