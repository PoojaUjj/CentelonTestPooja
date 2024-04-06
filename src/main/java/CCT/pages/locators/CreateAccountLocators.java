package CCT.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountLocators {
	
	@FindBy(css = "#maincontent > div.page-title-wrapper > h1 > span")
	public WebElement PageTitle;
    
	
	@FindBy(css = "#firstname")
	public WebElement FirstName;
	
	@FindBy(css = "#lastname")
	public WebElement LastName;

	@FindBy(css = "#email_address")
	public WebElement Email;

	@FindBy(css = "#password")
	public WebElement Password;

	@FindBy(css = "#password-confirmation")
	public WebElement ConfirmPassword;
	
	@FindBy(css = "#form-validate > div > div.primary > button")
	public WebElement CreateAccount;
	
}
