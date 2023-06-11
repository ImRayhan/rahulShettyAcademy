package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.WindowHandalesPracticePage;

public class WindowHandalesPracticePageTest extends BaseTest {
	String BASEURL = "https://rahulshettyacademy.com/AutomationPractice/";

	@Test
	public void verifyWindowHandales() throws InterruptedException {
		WindowHandalesPracticePage handle = new WindowHandalesPracticePage(driver);
		driver.get(BASEURL);
		handle.windowHandales();
		System.out.println("Title matched: "
				+ handle.verifyingTitle("QAClick Academy - A Testing Academy to Learn, Earn and Shine"));
		System.out.println("Url matched: " + handle.verifyCurrentUrl("http://www.qaclickacademy.com/"));

	}

}
