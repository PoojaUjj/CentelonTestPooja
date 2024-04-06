package CCT.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CCT.base.Page;
import CCT.pages.locators.LumaHomePageLocators;

public class LumaHomePage extends Page {

	public LumaHomePageLocators LumaHome;

	public LumaHomePage() {
		this.LumaHome = new LumaHomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.LumaHome);

	}

	public String verifyLoggedIn() {

		String WelcomeLine = LumaHome.WelcomeLine.getAttribute("innerHTML");
		String Wel = WelcomeLine.substring(0, 7);

		softassert.assertEquals(Wel, "Welcome", "Signin is not successfull");

		int length = WelcomeLine.length();
		String FullName = WelcomeLine.substring(9, length - 1);

		softassert.assertAll();

		return FullName;

	}

	public void verifyCustomerName(String Fullname) {

		String CustomerName = verifyLoggedIn();

		softassert.assertEquals(CustomerName, Fullname, "Customer Name is not displaying correctly");
		softassert.assertAll();

	}

}
