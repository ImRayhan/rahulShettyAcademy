package com.seleniumPractice.pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.seleniumPractice.basePage.BasePage;

public class DropDownPracticePage extends BasePage {


	public DropDownPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	WebDriver driver;
	Logger log = LogManager.getLogger(DropDownPracticePage.class);
	String SELECT = "//select[@id='dropdown-class-example']";

	public void selectOption() throws InterruptedException {
		Select sel = new Select(driver.findElement(By.xpath(SELECT)));
		sel.selectByIndex(0);
		log.info("Select index0 option1");
		Thread.sleep(1000);
		sel.selectByValue("option2");
		log.info("Select byValue option2");
		Thread.sleep(1000);
		log.info("Select ByVisibleText Option3");
		sel.selectByVisibleText("Option3");

	}

}
