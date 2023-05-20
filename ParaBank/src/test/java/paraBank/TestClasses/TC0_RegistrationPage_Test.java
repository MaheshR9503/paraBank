package paraBank.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ParaBank.Utility.RegisterPage_TestData;
import ParaBank.WebPages.RegistrationPage;
import commonMethods.TakeScreenShots;

public class TC0_RegistrationPage_Test extends BaseClass{
	
	
	private WebDriver driver;
	RegistrationPage regPage_obj;
	TakeScreenShots screenshot_obj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void initBrowser(String browser)
	{
		driver=openBrowser(browser);
		regPage_obj=new RegistrationPage(driver);
		screenshot_obj=new TakeScreenShots();
	}
	
	@Test(dataProvider = "getdata", dataProviderClass = RegisterPage_TestData.class)
	public void registrationPage(String firstname,String lastname,String address, String city, String state,String zipcode, String phone, String ssn,String uName, String pswd, String confirmPsd) throws InterruptedException
	{
		
		regPage_obj.enter_registrationPage();
		regPage_obj.enterFirstName(firstname);
		regPage_obj.enterLastName(lastname);
		regPage_obj.enterAddress(address);
		regPage_obj.enterCityName(city);
		regPage_obj.enterState(state);
		regPage_obj.enterZipcode(zipcode);
		regPage_obj.enterPhoneNumber(phone);
		regPage_obj.enterSsn(ssn);
		regPage_obj.enterUserName(uName);
		regPage_obj.enterPassword(pswd);
		regPage_obj.reEnterpassword(confirmPsd);
		regPage_obj.clickOnRegisterationButton();
		
	}

	@AfterMethod
	public void saveScreenShot() throws IOException
	{
		screenshot_obj.getScreenShots();
	}
	
}
