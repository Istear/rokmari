package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	public String homePageUrl = "https://www.rokomari.com/book"; 
	public By signInButton = By.xpath("//a[contains(text(),'Sign in')]"); 
	
}
