package com.sqa.jf.adactin;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

public class AdactinTC101 {

	private static String baseURL = "http://adactin.com/HotelAppBuild2";

	private static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Set WebDriver static instance using Firefox
		driver = new FirefoxDriver();
		// Maximize Window
		driver.manage().window().maximize();
		// Set Implicit Timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Go to base URL
		driver.get(baseURL);
	}

	@AfterMethod
	public void tearDown() {
		// Close driver and exit all windows
		driver.quit();
	}

	@Test
	public void testLogin() throws InterruptedException {
		String actualPageTitle;
		String expectedPageTitle = "AdactIn.com - Search Hotel";
		// Construct the Page Object AdactinLogin
		AdactinLogin homePage = new AdactinLogin(driver);
		// Call the method to login to adactin
		homePage.login("SQABCOct3", "sqaadmin2016");
		// Set actual Page Title
		actualPageTitle = driver.getTitle();
		// Assert that I am on the correct page
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
}
