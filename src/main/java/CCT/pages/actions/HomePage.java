package CCT.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CCT.base.Page;
import CCT.pages.locators.HomePageLocators;

public class HomePage extends Page {

	public HomePageLocators home;

	public HomePage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	public CreateAccount goToCreateAccount() {

		click(home.createAccount);

		return new CreateAccount();

	}

	public SignIn goTosignIn() {

		click(home.signIn);

		return new SignIn();

	}

}
