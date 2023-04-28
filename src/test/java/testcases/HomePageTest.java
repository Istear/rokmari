package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AuthorPageHA;
import pages.HomePage;
import utilities.BaseDriver;

public class HomePageTest extends BaseDriver {

	HomePage homepage = new HomePage();
	AuthorPageHA authorPageHA = new AuthorPageHA();
	
	@Test (description = "Submenu author links functionality")
	public void SubmenuHoverAuthorFunctionality(){
		
		driver.get(homepage.homePageUrl);
		homepage.hoverAndClick(homepage.authorHover, homepage.authorHA);
		assertEquals(authorPageHA.getText(authorPageHA.authorTitleHA), "হুমায়ূন আহমেদ");
	}
}
