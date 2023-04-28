package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	public String homePageUrl = "https://www.rokomari.com/book"; 
	public By signInButton = By.xpath("//a[contains(text(),'Sign in')]"); 
	public By authorHover = By.xpath("//a[@id='js--authors']"); 
	public By authorHA = By.xpath("//a[contains(text(),' হুমায়ূন আহমেদ ')]");
	public By userName = By.xpath("//span[@class='user-name']");
	public By popUpBy = By.xpath("//div[@class='popup-modal__body']");
	public By close = By.xpath("//body/div[@id='js--cart_abandonment_popup']/div[1]/button[1]");
	
}
