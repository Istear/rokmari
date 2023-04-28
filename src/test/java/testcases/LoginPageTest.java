package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.BaseDriver;
import utilities.DataSet;

public class LoginPageTest extends BaseDriver {

	HomePage homePage = new HomePage();
	LoginPage loginPage =  new LoginPage();

	public void loginTest(String email, String pass) {
		driver.get(homePage.homePageUrl);
		homePage.wait(2000);
		homePage.clickOnElement(homePage.signInButton);
		homePage.wait(2000);
		loginPage.wirteTex(loginPage.userEmail, email);
		loginPage.wirteTex(loginPage.userPassBy, pass);
		loginPage.clickOnElement(loginPage.signInButton);
		loginPage.wait(2000);
	}
	
	@Test(description = "Login functionality test with invalid test data.",priority = 1, dataProvider = "LoginErrorDataOne", dataProviderClass = DataSet.class)
	public void loginTestErrorOne(String email, String pass, String errorMsg) {
		loginTest(email, pass);
		assertEquals(loginPage.getText(loginPage.loginErrorAlert), errorMsg + email);
	}
	
	@Test(description = "Login functionality test with invalid test data.",priority = 2, dataProvider = "LoginErrorDataTwo", dataProviderClass = DataSet.class)
	public void loginTestErrorTwo(String email, String pass, String errorMsg) {
		loginTest(email, pass);
		assertEquals(loginPage.getText(loginPage.loginErrorMsg),errorMsg);
	}
	
	@Test(description = "Login functionality test with valid test data.",priority = 3, dataProvider = "LoginData", dataProviderClass = DataSet.class)
	public void loginTest(String number, String pass, String userName) {
		loginTest(number,pass);
		loginPage.wait(5000);
		assertEquals(homePage.getText(homePage.userName), userName);
	}
}
