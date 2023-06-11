package com.seleniumPractice.pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumPractice.basePage.BasePage;

public class GreenKartItemAddingPage extends BasePage {
	public GreenKartItemAddingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;
	Logger log = LogManager.getLogger(GreenKartItemAddingPage.class);
	String BROCOLLI = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]";
	String CAULIFLOWER = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]";
	String CUCUMBER = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/button[1]";
	String BEETROOT = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]";
	String CARROT = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/button[1]";
	String TOMATO = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[3]/button[1]";
	String BEANS = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[3]/button[1]";
	String BRINJAL = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[3]/button[1]";
	String CAPSICUM = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[3]/button[1]";
	String MUSHROOM = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[3]/button[1]";
	String POTATO = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[3]/button[1]";
	String PUMKIN = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[3]/button[1]";
	String CORN = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[3]/button[1]";
	String ONION = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[14]/div[3]/button[1]";
	String APPLE = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[15]/div[3]/button[1]";
	String BANANA = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[16]/div[3]/button[1]";
	String GRAPES = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[17]/div[3]/button[1]";
	String MANGO = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[3]/button[1]";
	String MUSKMELON = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[19]/div[3]/button[1]";
	String ORANGE = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[20]/div[3]/button[1]";
	String PEARS = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[21]/div[3]/button[1]";
	String POMEGRANATE = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[22]/div[3]/button[1]";
	String RASPBERRY = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[23]/div[3]/button[1]";
	String STAWBERRY = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[24]/div[3]/button[1]";
	String WATERMELON = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[25]/div[3]/button[1]";
	String ALMONDS = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[26]/div[3]/button[1]";
	String PISTA = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[27]/div[3]/button[1]";
	String NUTSMIXTURE = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[28]/div[3]/button[1]";
	String CASHEWS = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[29]/div[3]/button[1]";
	String WALNUTS = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[30]/div[3]/button[1]";

	public void allItemAddingToCart() {

		driver.findElement(By.xpath(BROCOLLI)).click();
		log.info("BROCOLLI CLICKed: " + BROCOLLI);

		driver.findElement(By.xpath(CAULIFLOWER)).click();
		log.info("CAULIFLOWER CLICKed: " + CAULIFLOWER);

		driver.findElement(By.xpath(CUCUMBER)).click();
		log.info("CUCUMBER CLICKed: " + CUCUMBER);

		driver.findElement(By.xpath(BEETROOT)).click();
		log.info("BEETROOT CLICKed: " + BEETROOT);

		driver.findElement(By.xpath(CARROT)).click();
		log.info("CARROT CLICKed: " + CARROT);

		driver.findElement(By.xpath(TOMATO)).click();
		log.info("TOMATO CLICKed: " + TOMATO);

		driver.findElement(By.xpath(BEANS)).click();
		log.info("BEANS CLICKed: " + BEANS);

		driver.findElement(By.xpath(BRINJAL)).click();
		log.info("BRINJAL CLICKed: " + BRINJAL);

		driver.findElement(By.xpath(CAPSICUM)).click();
		log.info("CAPSICUM CLICKed: " + CAPSICUM);

		driver.findElement(By.xpath(MUSHROOM)).click();
		log.info("MUSHROOM CLICKed: " + MUSHROOM);

		driver.findElement(By.xpath(POTATO)).click();
		log.info("POTATO CLICKed: " + POTATO);

		driver.findElement(By.xpath(PUMKIN)).click();
		log.info("PUMKIN CLICKed: " + PUMKIN);

		driver.findElement(By.xpath(CORN)).click();
		log.info("CORN CLICKed: " + CORN);

		driver.findElement(By.xpath(ONION)).click();
		log.info("ONION CLICKed: " + ONION);

		driver.findElement(By.xpath(APPLE)).click();
		log.info("APPLE CLICKed: " + APPLE);

		driver.findElement(By.xpath(BANANA)).click();
		log.info("BANANA CLICKed: " + BANANA);

		driver.findElement(By.xpath(GRAPES)).click();
		log.info("GRAPES CLICKed: " + GRAPES);

		driver.findElement(By.xpath(MANGO)).click();
		log.info("MANGO CLICKed: " + MANGO);

		driver.findElement(By.xpath(MUSKMELON)).click();
		log.info("MUSKMELON CLICKed: " + MUSKMELON);

		driver.findElement(By.xpath(ORANGE)).click();
		log.info("ORANGE CLICKed: " + ORANGE);

		driver.findElement(By.xpath(PEARS)).click();
		log.info("PEARS CLICKed: " + PEARS);

		driver.findElement(By.xpath(POMEGRANATE)).click();
		log.info("POMEGRANATE CLICKed: " + POMEGRANATE);

		driver.findElement(By.xpath(RASPBERRY)).click();
		log.info("RASPBERRY CLICKed: " + RASPBERRY);

		driver.findElement(By.xpath(STAWBERRY)).click();
		log.info("STAWBERRY CLICKed: " + STAWBERRY);

		driver.findElement(By.xpath(WATERMELON)).click();
		log.info("WATERMELON CLICKed: " + WATERMELON);

		driver.findElement(By.xpath(ALMONDS)).click();
		log.info("ALMONDS CLICKed: " + ALMONDS);

		driver.findElement(By.xpath(PISTA)).click();
		log.info("PISTA CLICKed: " + PISTA);

		driver.findElement(By.xpath(NUTSMIXTURE)).click();
		log.info("NUTSMIXTURE CLICKed: " + NUTSMIXTURE);

		driver.findElement(By.xpath(CASHEWS)).click();
		log.info("CASHEWS CLICKed: " + CASHEWS);

		driver.findElement(By.xpath(WALNUTS)).click();
		log.info("WALNUTS CLICKed: " + WALNUTS);

	}
}
