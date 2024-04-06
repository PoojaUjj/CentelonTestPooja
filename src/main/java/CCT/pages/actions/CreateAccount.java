package CCT.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CCT.base.Page;
import CCT.pages.locators.CreateAccountLocators;

public class CreateAccount extends Page {

	public CreateAccountLocators CreateA;

	public CreateAccount() {

		this.CreateA = new CreateAccountLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.CreateA);

	}

	public void verifyaccountTitle() {

		String PageTitle = CreateA.PageTitle.getText();

		softassert.assertEquals(PageTitle, "Create New Customer Account", "Create account page is not getting open");

		softassert.assertAll();

	}

	public LumaHomePage createAccount(String FirstName, String LastName, String Email, String Password,
			String ConfirmPassword) {

		type(CreateA.FirstName, FirstName);
		type(CreateA.LastName, LastName);
		type(CreateA.Email, Email);
		type(CreateA.Password, Password);
		type(CreateA.ConfirmPassword, ConfirmPassword);
		click(CreateA.CreateAccount);

		return new LumaHomePage();

	}

}
