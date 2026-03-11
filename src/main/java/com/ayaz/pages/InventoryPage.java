package com.ayaz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	WebDriver driver;
	By productTitle = By.className("title");

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getProductTitle() {
		return driver.findElement(productTitle).getText();
	}
}
