package com.ayaz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLogin {
	WebDriver driver;
	By userName = By.id("user-name");
	By passWord = By.id("password");
	By loginButton = By.id("login-button");

	public SauceDemoLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUser(String user) {
		driver.findElement(userName).sendKeys(user);
	}

	public void typePass(String pass) {
		driver.findElement(passWord).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
}
