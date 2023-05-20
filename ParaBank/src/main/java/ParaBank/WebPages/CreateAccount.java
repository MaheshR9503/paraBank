package ParaBank.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	private WebDriver driver;
	
	public CreateAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	
	@FindBy(linkText = "Open New Account")					private WebElement click_onAccountButton;
	@FindBy(id = "type")									private WebElement select_AccountType;
	@FindBy(id = "fromAccountId")							private WebElement select_dropDowwn;
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div/input")		private WebElement click_createAccount;
	
	
	public AccountVerification_page accountCreated()
	{
		click_onAccountButton.click();
		Select s1=new Select(select_AccountType);
		s1.selectByIndex(1);
		
		Select s2=new Select(select_dropDowwn);
		s2.selectByIndex(0);
		
		click_createAccount.click();
		
		return new AccountVerification_page(driver);
	}

}
