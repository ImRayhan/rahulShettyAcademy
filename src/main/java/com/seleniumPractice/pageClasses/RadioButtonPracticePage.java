package com.seleniumPractice.pageClasses;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniumPractice.basePage.BasePage;

public class RadioButtonPracticePage extends BasePage {

	public RadioButtonPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	Logger log = LogManager.getLogger(RadioButtonPracticePage.class);
	WebDriver driver;
	String RADIO1 = "//input[@type='radio']";

	public void radioButton() throws InterruptedException {
		boolean ischekd = false;

		List<WebElement> radio = driver.findElements(By.xpath(RADIO1));
		int size = radio.size();
		System.out.println("size of elements " + size);
		for (int i = 0; i < radio.size(); i++) {
			ischekd = radio.get(i).isSelected();
			if (!ischekd) {
				radio.get(i).click();
				log.info("Clicked " + radio.get(i));

			}

		}

	}

}
