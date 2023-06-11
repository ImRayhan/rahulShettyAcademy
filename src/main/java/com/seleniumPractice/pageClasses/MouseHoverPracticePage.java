package com.seleniumPractice.pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.seleniumPractice.basePage.BasePage;

public class MouseHoverPracticePage extends BasePage {

	public MouseHoverPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	org.apache.logging.log4j.Logger log = LogManager.getLogger(MouseHoverPracticePage.class);

	String MOUSEHOVER = "//button[@id='mousehover']";
	String TOP = "//a[normalize-space()='Top']";

	WebDriver driver;

	public void MouseHover() {
		Actions ac = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath(MOUSEHOVER));
		ac.moveToElement(hover).build().perform();
	WebElement top=	driver.findElement(By.xpath(TOP));
	ac.moveToElement(top).click().build().perform();
	
		log.info("click top");

	}

}
