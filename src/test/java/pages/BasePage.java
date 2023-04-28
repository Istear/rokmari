package pages;

import static utilities.BaseDriver.driver;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Allure;

public class BasePage {
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	public void wirteTex(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	}
	public void scrollToBottom() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	public void scrollToElemnt(By loactor) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", getElement(loactor));
	}
	
	public void selectDropDown(By locator, int index) {
		Select drpDownSelect = new Select (driver.findElement(locator));
		drpDownSelect.selectByIndex(index);
	}
	
	public void selectDropDownByText(By locator, String name) {
		Select drpDownSelect = new Select (driver.findElement(locator));
		drpDownSelect.selectByVisibleText(name);
	}
	
	public void selectDropDownByValue(By locator, String num) {
		Select drpDownSelect = new Select (driver.findElement(locator));
		drpDownSelect.selectByValue(num);
	}
	
	
	public void searchByText(By locator, String text){
        wirteTex(locator, text);
        getElement(locator).sendKeys(Keys.ARROW_DOWN);
        getElement(locator).sendKeys(Keys.ENTER);
    }
	
	public void hoverAndClick(By locator, By subLocator) {
		Actions actions = new Actions(driver);
		actions.moveToElement(getElement(locator));
		actions.moveToElement(getElement(subLocator));
		actions.click().build().perform();
	}
	
}