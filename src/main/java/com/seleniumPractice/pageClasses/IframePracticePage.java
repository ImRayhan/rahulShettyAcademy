package com.seleniumPractice.pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniumPractice.basePage.BasePage;

public class IframePracticePage extends BasePage {

	public IframePracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	Logger log = LogManager.getLogger(IframePracticePage.class);

	WebDriver driver;
	String CONTACTUS = "//a[normalize-space()='Contact Us']";
	String REGISTER = "//a[normalize-space()='Register']";

	public void iframe() {

		driver.switchTo().frame(0);
		driver.findElement(By.xpath(CONTACTUS)).click();
		WebElement reg = driver.findElement(By.xpath(REGISTER));
		boolean didplay = reg.isDisplayed();
		log.info("Element displayed: "+didplay);

	}

}
