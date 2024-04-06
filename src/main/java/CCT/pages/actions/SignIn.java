package CCT.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CCT.base.Page;
import CCT.pages.locators.SignInLocators;

public class SignIn extends Page {

	public SignInLocators signIn;

	public SignIn() {

		this.signIn = new SignInLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signIn);

	}

	public LumaHomePage signIn(String Email, String Password) {

		type(signIn.SEmail, Email);
		type(signIn.SPassword, Password);

		click(signIn.SignInBtn);

		return new LumaHomePage();

	}

}
