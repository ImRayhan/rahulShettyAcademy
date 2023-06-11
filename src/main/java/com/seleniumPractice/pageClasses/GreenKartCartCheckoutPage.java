package com.seleniumPractice.pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.seleniumPractice.basePage.BasePage;

public class GreenKartCartCheckoutPage extends BasePage {
	public GreenKartCartCheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;
	Logger log = LogManager.getLogger(GreenKartCartCheckoutPage.class);
	String CART = "//img[@alt='Cart']";
	String PROCEEDTOCHECKOUT = "//button[normalize-space()='PROCEED TO CHECKOUT']";
	String PLACEORDER = "//button[normalize-space()='Place Order']";
	String CHOOSECOUNTRY = "//div[@class='wrapperTwo']//div//select";
	String country = "United States";
	String CHECKBOXtERMANDCONDITION = "//input[@type='checkbox']";
	String PROCEED = "//button[normalize-space()='Proceed']";

	public void placingOrder() {
		driver.findElement(By.xpath(CART)).click();
		log.info("CART CLICKed: " + CART);

		driver.findElement(By.xpath(PROCEEDTOCHECKOUT)).click();
		log.info("PROCEEDTOCHECKOUT CLICKed: " + PROCEEDTOCHECKOUT);

		driver.findElement(By.xpath(PLACEORDER)).click();
		log.info("PLACEORDER CLICKed: " + PLACEORDER);

		Select sel = new Select(driver.findElement(By.xpath(CHOOSECOUNTRY)));
		sel.selectByVisibleText(country);
		log.info("CHOOSECOUNTRY : " + country);

		driver.findElement(By.xpath(CHECKBOXtERMANDCONDITION)).click();
		log.info("CHECKBOXtERMANDCONDITION CLICKed: " + CHECKBOXtERMANDCONDITION);
		driver.findElement(By.xpath(PROCEED)).click();
		log.info("PROCEED CLICKed: " + PROCEED);

	}

}
