package com.seleniumPractice.testClasses;

import org.testng.annotations.Test;

import com.seleniumPractice.baseTest.BaseTest;
import com.seleniumPractice.pageClasses.GreenKartCartCheckoutPage;
import com.seleniumPractice.pageClasses.GreenKartItemAddingPage;

public class PlacingOrderTest extends BaseTest {
	private String BASEURL = "https://rahulshettyacademy.com/seleniumPractise/#/";

	@Test
	public void verifyPlacingOrder() {
		driver.get(BASEURL);
		GreenKartItemAddingPage add = new GreenKartItemAddingPage(driver);
		add.allItemAddingToCart();
		System.out.println("Title mached: "+add.verifyingTitle("GreenKart - veg and fruits kart"));
		System.out.println("url mached: "+add.verifyCurrentUrl("https://rahulshettyacademy.com/seleniumPractise/#/"));
		GreenKartCartCheckoutPage place = new GreenKartCartCheckoutPage(driver);
		place.placingOrder();

	}

}
