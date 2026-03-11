package com.ayaz.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ayaz.pages.InventoryPage;
import com.ayaz.pages.SauceDemoLogin;

public class SauceDemoTest extends BaseTest {
	/*
	 * WebDriver driver; SauceDemoLogin login;
	 * 
	 * @BeforeMethod public void setUp() { driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.get("https://www.saucedemo.com/"); login = new SauceDemoLogin(driver);
	 * }
	 */

	@Test
	public void loginTest() {
		SauceDemoLogin login = new SauceDemoLogin(driver);
		login.typeUser(prop.getProperty("username"));
		login.typePass(prop.getProperty("password"));
		login.clickLogin();
		/*
		 * String url = driver.getCurrentUrl();
		 * Assert.assertTrue(url.contains("inventory"), "url mismatch");
		 */
		InventoryPage dashboard = new InventoryPage(driver);
		String title = dashboard.getProductTitle();
		Assert.assertEquals(title, "Products", "title not found");

	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}
