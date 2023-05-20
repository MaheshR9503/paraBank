package paraBank.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ParaBank.WebPages.AccountVerification_page;
import ParaBank.WebPages.CreateAccount;
import ParaBank.WebPages.Login_page;

public class TC2_CreateAccountPage_Test extends BaseClass{
	
	private WebDriver driver;
	Login_page login_obj;
	CreateAccount createAccount_obj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void initBrowsers(String browser)
	{
		driver=openBrowser(browser);
		login_obj=new Login_page(driver);
	}
	
	@Test
	public void createNewAccount()
	{
		 createAccount_obj = login_obj.userLogin("john","demo");
		 createAccount_obj.accountCreated();
		
	}

}
