package ParaBank.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountVerification_page {

	private WebDriver driver;
	
	public AccountVerification_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/p[1]")		private WebElement verificationmsg;
	
	
	public String verifyAccount()
	{
		return verificationmsg.getText();
	}
	
	
	
	
	
}
