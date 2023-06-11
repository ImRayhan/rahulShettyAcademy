package com.seleniumPractice.testClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.MouseHoverPracticePage;

public class MouseHoverPracticePageTest extends BaseTest {
	String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";
	Logger log = LogManager.getLogger(MouseHoverPracticePageTest.class);

	@Test
	public void verfyMouseHover() {
		driver.get(BASEURL);
		MouseHoverPracticePage check = new MouseHoverPracticePage(driver);
		check.MouseHover();
		log.info("Title matched: "
				+ check.verifyingTitle("Practice Page"));
		log.info("Url matched: " + check.verifyCurrentUrl("https://rahulshettyacademy.com/AutomationPractice/#top"));

	}

}
