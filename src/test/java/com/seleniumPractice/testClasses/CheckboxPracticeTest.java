package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.CheckboxPracticePage;

public class CheckboxPracticeTest extends BaseTest {
	String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void verifyCheckbox() {
		driver.get(BASEURL);
		CheckboxPracticePage check = new CheckboxPracticePage(driver);
		check.checkbox();
		System.out.println("Title matched: " + check.verifyingTitle("Practice Page"));
		System.out
				.println("Url matched: " + check.verifyCurrentUrl("https://rahulshettyacademy.com/AutomationPractice/"));
	}

	}


