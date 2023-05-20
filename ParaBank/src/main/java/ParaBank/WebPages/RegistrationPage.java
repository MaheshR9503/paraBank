package ParaBank.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	private WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(linkText = "Register")						private WebElement clickOnRegisterButton;
	@FindBy(id = "customer.firstName")					private WebElement enter_firstName;
	@FindBy(id = "customer.lastName")					private WebElement enter_lastName;
	@FindBy(id = "customer.address.street")				private WebElement enter_address;
	@FindBy(id = "customer.address.city")				private WebElement enter_cityName;
	@FindBy(id = "customer.address.state")				private WebElement enter_state;
	@FindBy(id = "customer.address.zipCode")			private WebElement enter_zipCode;
	@FindBy(id = "customer.phoneNumber")				private WebElement enter_phoneNumber;
	@FindBy(id = "customer.ssn")						private WebElement enter_ssn;
	@FindBy(id = "customer.username")					private WebElement enter_username;
	@FindBy(id = "customer.password")					private WebElement enter_password;
	@FindBy(id = "repeatedPassword")					private WebElement reEnter_password;
	@FindBy(css = "input[value='Register']")			private WebElement click_RegisterBUtton;
	
	public void enter_registrationPage()
	{
		clickOnRegisterButton.click();
	}
	
	public void enterFirstName(String fname)
	{
		if(enter_firstName.isDisplayed()) {
		enter_firstName.sendKeys(fname);
		}
	}
	
	public void enterLastName(String fname)
	{	
		if(enter_lastName.isDisplayed()) {
		enter_lastName.sendKeys(fname);
		}
	}
	
	public void enterAddress(String fname)
	{
		enter_address.sendKeys(fname);
	}
	
	public void enterCityName(String fname)
	{
		enter_cityName.sendKeys(fname);
	}
	
	public void enterState(String fname)
	{
		enter_state.sendKeys(fname);
	}
	
	public void enterZipcode(String fname)
	{
		enter_zipCode.sendKeys(fname);
	}
	
	public void enterPhoneNumber(String fname)
	{
		enter_phoneNumber.sendKeys(fname);
	}
	
	public void enterSsn(String fname)
	{
		enter_ssn.sendKeys(fname);
	}
	
	public void enterUserName(String fname)
	{
		enter_username.sendKeys(fname);
	}
	
	public void enterPassword(String fname)
	{
		enter_password.sendKeys(fname);
	}
	
	public void reEnterpassword(String fname)
	{
		reEnter_password.sendKeys(fname);
	}
	
	public void clickOnRegisterationButton()
	{
		click_RegisterBUtton.click();
	}
}
