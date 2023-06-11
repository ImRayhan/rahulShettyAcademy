package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.IframePracticePage;

public class IframePracticePageTest extends BaseTest {

	String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/#top";

	@Test
	public void verifyIframe() {
		driver.get(BASEURL);
		IframePracticePage i = new IframePracticePage(driver);
		i.iframe();

	}

}
