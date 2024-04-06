package CCT.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLocators {

	@FindBy(css = "#email")
	public WebElement SEmail;

	@FindBy(css = "#pass")
	public WebElement SPassword;

	@FindBy(css = "#send2")
	public WebElement SignInBtn;

}
