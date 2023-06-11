package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.RadioButtonPracticePage;

public class RadioButtonPracticePageTest extends BaseTest {
	private String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void verifyingRadioButton() throws InterruptedException {
		driver.get(BASEURL);
		RadioButtonPracticePage check = new RadioButtonPracticePage(driver);
		check.radioButton();
		System.out.println("Title matched: " + check.verifyingTitle("Practice Page"));
		System.out.println(
				"Url matched: " + check.verifyCurrentUrl("https://rahulshettyacademy.com/AutomationPractice/"));

	}

}
