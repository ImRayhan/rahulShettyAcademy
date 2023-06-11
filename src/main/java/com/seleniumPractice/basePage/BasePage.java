package com.seleniumPractice.basePage;

import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyingTitle(String expectedTitle) {
		return driver.getTitle().equalsIgnoreCase(expectedTitle);

	}

	public boolean verifyCurrentUrl(String expectedUrl) {
		return driver.getCurrentUrl().equalsIgnoreCase(expectedUrl);

	}

}
