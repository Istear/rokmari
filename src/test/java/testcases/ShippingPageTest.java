package testcases;

import org.testng.annotations.Test;

import pages.AuthorPageHA;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ShippingPage;
import utilities.BaseDriver;

public class ShippingPageTest extends BaseDriver {
	
	HomePage homePage = new HomePage();
	AuthorPageHA authorPageHA = new AuthorPageHA();
	CartPage cartPage = new CartPage();
	ShippingPage shippingPage = new ShippingPage();
	LoginPage loginPage = new LoginPage();
	LoginPageTest loginPageTest = new LoginPageTest();
	 
	@Test(description = "Shipping page information form fields functionality test without placing order")
	public void shippingPageFunctionalityTest() {
		loginPageTest.loginTest("01736278083", "i@m1997s");
		shippingPage.wait(2000);
		homePage.hoverAndClick(homePage.authorHover, homePage.authorHA);
		authorPageHA.scrollToElemnt(authorPageHA.bohubrihiBook);
		authorPageHA.wait(6000);
		authorPageHA.hoverAndClick(authorPageHA.bohubrihiBook, authorPageHA.bohubrihiCartButton);
		authorPageHA.clickOnElement(authorPageHA.cartButton);
		authorPageHA.wait(2000);
		cartPage.clickOnElement(cartPage.placeOrderButton);
		cartPage.wait(2000);
		shippingPage.clickOnElement(shippingPage.officeLabel);
		shippingPage.selectDropDownByText(shippingPage.countrySelect, "Bangladesh");
		shippingPage.wait(3000);
		shippingPage.selectDropDownByValue(shippingPage.citySelect, "2");
		shippingPage.wait(3000);
		shippingPage.selectDropDownByValue(shippingPage.areaSelect, "10");
		shippingPage.wirteTex(shippingPage.addressText, "Testing fields");
		shippingPage.scrollToElemnt(shippingPage.codLabel);
		shippingPage.clickOnElement(shippingPage.codLabel);
		shippingPage.scrollToElemnt(shippingPage.termsLabel);
		shippingPage.scrollToBottom();
		shippingPage.clickOnElement(shippingPage.termsLabel);
		shippingPage.wait(5000);
	}
}
