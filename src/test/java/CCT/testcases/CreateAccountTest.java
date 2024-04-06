package CCT.testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import CCT.base.Page;

import CCT.pages.actions.HomePage;
import CCT.pages.actions.LumaHomePage;
import CCT.utilities.Utilities;

public class CreateAccountTest {

	@BeforeSuite
	public void setup() {

		Page.initConfiguration();
	}

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		HomePage home = new HomePage();

		home.goToCreateAccount().createAccount(data.get("FirstName"), data.get("LastName"), data.get("Email"),
				data.get("Password"), data.get("ConfirmPassword"));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LumaHomePage lumahome = new LumaHomePage();
		lumahome.verifyLoggedIn();
		lumahome.verifyCustomerName(data.get("FullName"));

	}

	@AfterSuite
	public void tearDown() {
		Page.quitBrowser();
	}

}
