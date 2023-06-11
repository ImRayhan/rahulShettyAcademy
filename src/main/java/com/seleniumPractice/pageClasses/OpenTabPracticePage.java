package com.seleniumPractice.pageClasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.seleniumPractice.basePage.BasePage;

public class OpenTabPracticePage extends BasePage {
	public OpenTabPracticePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	WebDriver driver;
	String OPENTAB = "//a[@id='opentab']";
	String COURSES = "//li[@class='nav-item']//a[normalize-space()='Courses']";

	public void openTab() throws InterruptedException {
		String parentTab = driver.getWindowHandle();
		driver.findElement(By.xpath(OPENTAB)).click();
		Set<String> childTab = driver.getWindowHandles();
		for (String handle : childTab) {
			if (!handle.equals(parentTab)) {
				driver.switchTo().window(handle);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(COURSES)));
				e.click();

			}

		}

	}

}
