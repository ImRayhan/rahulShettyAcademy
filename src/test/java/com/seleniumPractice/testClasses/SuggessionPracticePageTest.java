package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.SuggessionPracticePage;

public class SuggessionPracticePageTest extends BaseTest {
	private String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void verifyAutoSuggession() throws InterruptedException {
		driver.get(BASEURL);
		SuggessionPracticePage type = new SuggessionPracticePage(driver);
		type.autoSuggession();
		System.out.println("Title matched: " + type.verifyingTitle("Practice Page"));
		System.out
				.println("Url matched: " + type.verifyCurrentUrl("https://rahulshettyacademy.com/AutomationPractice/"));

	}

}
