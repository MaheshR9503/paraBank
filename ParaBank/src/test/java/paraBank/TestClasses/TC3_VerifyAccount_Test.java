package paraBank.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ParaBank.WebPages.AccountVerification_page;
import ParaBank.WebPages.CreateAccount;
import ParaBank.WebPages.Login_page;

public class TC3_VerifyAccount_Test extends BaseClass {
	
	
	private WebDriver driver;
	Login_page login_obj;
	CreateAccount createAccount_obj;
	AccountVerification_page accountCreated_obj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void initBrowsers(String browser)
	{
		driver=openBrowser(browser);
		login_obj=new Login_page(driver);
	}

	@Test(priority = 1)
	public void tc1ANdtc2()
	{
		createAccount_obj=login_obj.userLogin("john","demo");
		 accountCreated_obj = createAccount_obj.accountCreated();
	}
	
	@Test(priority = 2)
	public void accountVerification()
	{
		String verifyAccount = accountCreated_obj.verifyAccount();
		String expectedMsg="Congratulations, your account is now open.";
		Assert.assertEquals(verifyAccount, expectedMsg);
		System.out.println("Congratulations, your account is now open.");
	}
}
