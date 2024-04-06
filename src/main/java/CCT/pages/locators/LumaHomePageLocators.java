package CCT.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LumaHomePageLocators {

	@FindBy(css = "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.greet.welcome > span")
	public WebElement WelcomeLine;

}
