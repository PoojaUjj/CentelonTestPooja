package CCT.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(css = "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li:nth-child(3) > a")
	public WebElement createAccount;

	@FindBy(css = "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a")
	public WebElement signIn;

}
