package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.OpenTabPracticePage;

public class OpenTabPracticePageTest extends BaseTest {
	String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void verifyingOpeTab() throws InterruptedException {
		driver.get(BASEURL);
		OpenTabPracticePage check = new OpenTabPracticePage(driver);
		check.openTab();
		System.out.println("Title matched: "
				+ check.verifyingTitle("QA Click Academy | Corporate Trainings from Professionals | Udemy"));
		System.out.println("Url matched: " + check.verifyCurrentUrl("https://www.udemy.com/user/testing-minds/"));

	}

}
