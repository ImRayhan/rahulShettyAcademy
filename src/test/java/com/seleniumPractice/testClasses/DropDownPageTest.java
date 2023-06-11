package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.DropDownPracticePage;

public class DropDownPageTest extends BaseTest {
	private String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void verifyingDropdown() throws InterruptedException {
		driver.get(BASEURL);
		DropDownPracticePage sel = new DropDownPracticePage(driver);
		sel.selectOption();
		System.out.println("Title matched: " + sel.verifyingTitle("Practice Page"));
		System.out
				.println("Url matched: " + sel.verifyCurrentUrl("https://rahulshettyacademy.com/AutomationPractice/"));
	}

}
