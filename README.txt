Project Name: CentelonCT

Overview:
This project is a demonstration of Selenium WebDriver usage with Java, integrated into Eclipse IDE using Maven as the build automation tool. 
Additionally, it includes reporting functionalities using both ReportNG and Extent Reports. 
This setup provides comprehensive test reporting for better analysis and debugging.
Test Cases written in this project given apportunity to user to test Create Account and Sign In functionality.
Also in pom.xml, two profiles is created , one for create account and then verify successful login and second profile is for sign in and then 
verify successfull login.

Setup:
Clone the Repository:
Clone this repository to your local machine using the following command:
git clone <repository-url>

Import Project into Eclipse:
Open Eclipse IDE and import the Maven project by following these steps:
Click on File > Import.
Choose Existing Maven Projects and click Next.
Browse to the directory where you cloned the repository and select the project folder.
Click Finish to import the project.

Install Dependencies:
Maven will automatically download the dependencies specified in the pom.xml file. Ensure that Maven is properly configured in Eclipse.

WebDriver Setup:
Ensure the appropriate WebDriver executable (e.g., ChromeDriver, GeckoDriver) is available in your system PATH or provide the path to the executable in your test scripts.

Project Structure:
The project follows the standard Maven directory structure:

src/main/java: Contains the main Java source files.
src/test/java: Contains the test Java source files.
src/test/resources: Contains resources utilized by the tests (e.g., test data, configuration files).
pom.xml: Maven project configuration file containing dependencies and build settings.

Writing Tests:
Test scripts using Selenium WebDriver are written in Java and can be found in the src/test/java/CCT.testcases directory. 
The tests are written using TestNG framework annotations.
CreateAccountTest.java : This test is creating account and then verifying that login is successfull and customer name display is correct
SignInTest.java : This test is signing in to account and then verifying that login is successfull and customer name display is correct

Reporting:
1. ReportNG:
ReportNG is an HTML reporting plugin for TestNG. It generates detailed HTML reports with test execution results.

To generate ReportNG reports:

Run your TestNG tests.
ReportNG reports will be generated automatically in the test-output directory.

2. Extent Reports:
Extent Reports provides interactive and detailed HTML reports for test executions. 
It includes features like screenshots, logs, and categorized views.

To generate Extent Reports:

Include ExtentReports dependency in your pom.xml.
Write code to configure ExtentReports in your test classes.
Run your TestNG tests.
Extent Reports will be generated in target/surefire-reports/html/extent.html .

Running Tests:
Tests can be executed using TestNG in Eclipse:
Right-click on src/test/resources/runner/signIn.xml or createAccount.xml
Select Run As > TestNG Test.

Alternatively, you can run tests from the command line using Maven:

Open cmd to project path.
If you want to execute createAccount test then write below:
mvn test -PCreatingAccount

If you want to execute Sign In test then write below:
mvn test -PDoSignIn

By Default test will run on "Chrome" browser. If you want to run on firefox then write
mvn test -Dbrowser=firefox -PDoSignIn
mvn test -Dbrowser=firefox -PCreatingAccount

Additional Notes:
Ensure that your system meets the requirements for running Selenium WebDriver tests.
Manage dependencies and WebDriver versions carefully to avoid compatibility issues.
Maintain a clean and organized project structure for better maintainability.
