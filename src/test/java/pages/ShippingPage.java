package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage {

	public By homeLabel = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/p[2]/label[1]");
	public By officeLabel = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/p[3]/label[1]");
	public By countrySelect = By.xpath("//select[@class='custom-select js-shipping-country js-shipping-courier']");
	public By citySelect = By.xpath("//select[@id='js--city']");
	public By areaSelect = By.xpath("//select[@id='js--area']");
	public By addressText = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]");
	public By codLabel = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]");
	public By termsLabel = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");
}
