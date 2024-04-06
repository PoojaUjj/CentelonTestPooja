package CCT.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CCT.utilities.ExcelReader;
import CCT.utilities.ExtentManager;

public class Page {

	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");

	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static SoftAssert softassert;
	public static WebDriverWait wait;

	public static void initConfiguration() {
		
		
		System.out.println(System.getProperty("browser"));
		
		String BrowserName= System.getProperty("browser")!=null ? System.getProperty("browser") : Constants.browser;
		

		
		System.out.println(BrowserName);
		

		if (BrowserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Constants.browser.equals("ie")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		}

		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		softassert = new SoftAssert();
		
		

	}

	public static void click(WebElement element) {

		element.click();

		test.log(LogStatus.INFO, "Clicking on : " + element);
	}

	public static void type(WebElement element, String value) {

		element.sendKeys(value);

		test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);

	}

	public static void quitBrowser() {

		driver.close();

	}

}
