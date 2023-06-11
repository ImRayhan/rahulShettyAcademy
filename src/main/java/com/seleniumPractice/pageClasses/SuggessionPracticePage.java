package com.seleniumPractice.pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniumPractice.basePage.BasePage;

import dev.failsafe.internal.util.Assert;

public class SuggessionPracticePage extends BasePage {
	
	public SuggessionPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	WebDriver driver;
	Logger log = LogManager.getLogger(SuggessionPracticePage.class);
	String TYPETOSELECTCOUNTRY = "//input[@id='autocomplete']";

	public void autoSuggession() throws InterruptedException {

		WebElement field = driver.findElement(By.xpath(TYPETOSELECTCOUNTRY));
		field.clear();
		log.info("Clear field");
		field.sendKeys("USA");
		Thread.sleep(1000);
		log.info("Enter USA field");
		field.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		log.info("Hit  arrow");
		field.sendKeys(Keys.ENTER);
		log.info("Hit enter");
		Thread.sleep(1000);	


	}

}
