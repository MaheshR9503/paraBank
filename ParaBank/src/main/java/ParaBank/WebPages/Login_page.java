package ParaBank.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	private WebDriver driver;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name = "username")					private WebElement userName;
	@FindBy(name = "password")					private WebElement password;
	@FindBy(css = "input[value='Log In']")		private WebElement login_button;
	
	
	public CreateAccount userLogin(String username, String pswd)
	{
		userName.sendKeys(username);
		password.sendKeys(pswd);
		login_button.click();
		
		return new CreateAccount(driver);
	}
	
	

}
