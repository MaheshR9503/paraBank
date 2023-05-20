package paraBank.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ParaBank.WebPages.Login_page;

public class TC1_LoginPage_Test extends BaseClass {
	
	
	private WebDriver driver;
	Login_page login_obj;
	
	@Parameters({"browser"})
	@BeforeClass
	public void initBrowser(String browser)
	{
		driver=openBrowser(browser);
		login_obj=new Login_page(driver);
	}
	
	
	@Test
	public void userableTo_login()
	{
		login_obj.userLogin("john","demo");
	}
	
	

}
