package pages;

import org.openqa.selenium.By;

public class AuthorPageHA extends BasePage {

	public By authorTitleHA = By.xpath("//h4[contains(text(),'হুমায়ূন আহমেদ')]");
	public By bohubrihiBook = By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[53]/div[1]");
	public By bohubrihiCartButton = By.xpath("//button[@class='btn cart-btn js--add-to-cart' and @product-id='1211' ]");
	public By cartButton = By.xpath("//img[@alt='cart_icon']");
}
