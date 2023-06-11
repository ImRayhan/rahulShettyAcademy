package com.seleniumPractice.pageClasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.seleniumPractice.basePage.BasePage;

public class WindowHandalesPracticePage extends BasePage {
	public WindowHandalesPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	WebDriver driver;
	String OPENWINDOW = "//button[@id='openwindow']";
	String CONTACT = "//li[@class='nav-item']//a[@href='contactus.html'][normalize-space()='Contact']";

	public void windowHandales() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath(OPENWINDOW)).click();
		Set<String> childWindow = driver.getWindowHandles();
		for (String handle : childWindow) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);

			}

		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONTACT)));
		e.click();

	}

}
