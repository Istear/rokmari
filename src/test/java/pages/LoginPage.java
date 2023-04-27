package pages;


import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	public By signInButton = By.xpath("//button[contains(text(),'Sign In')]"); 
	public By userEmail = By.xpath("//input[@id='j_username']"); 
	public By userPassBy = By.xpath("//input[@id='j_password']");
	public By loginErrorAlert = By.xpath("//p[contains(text(),' Wrong email or phone ')]");  
	public By loginErrorMsg = By.xpath("//p[contains(text(),'Wrong email/phone or password')]"); 
}
