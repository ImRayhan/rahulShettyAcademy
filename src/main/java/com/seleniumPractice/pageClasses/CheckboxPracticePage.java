package com.seleniumPractice.pageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniumPractice.basePage.BasePage;

public class CheckboxPracticePage extends BasePage {
	public CheckboxPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	WebDriver driver;

	String OPTION = "//input[@type='checkbox']";

	public void checkbox() {
		boolean ischeck = false;

		List<WebElement> s = driver.findElements(By.xpath(OPTION));
		System.out.println(s);
		for (int i = 0; i < s.size(); i++) {
			ischeck = s.get(i).isSelected();
			if (!ischeck) {
				s.get(i).click();

			}

		}
	}

}
