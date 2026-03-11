package com.ayaz.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTestCheck1 {
	@Test
	public void setUp() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("The title is "+ driver.getTitle());
		driver.quit();
	}

}
