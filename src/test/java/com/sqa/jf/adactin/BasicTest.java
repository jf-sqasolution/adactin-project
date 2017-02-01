/**
 * File Name: BasicTest.java<br>
 * LastName, FirstName<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 24, 2016
 */
package com.sqa.jf.adactin;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

/**
 * BasicTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class BasicTest {

	private String baseURL;

	private WebDriver driver;

	public BasicTest(String baseURL) {
		this.baseURL = baseURL;
	}

	public String getBaseURL() {
		return this.baseURL;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	@BeforeMethod
	public void setUp() {
		// Set WebDriver static instance using Firefox
		this.driver = new FirefoxDriver();
		// Maximize Window
		this.driver.manage().window().maximize();
		// Set Implicit Timeout
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Go to base URL
		this.driver.get(this.baseURL);
	}

	@AfterMethod
	public void tearDown() {
		// Close driver and exit all windows
		this.driver.quit();
	}
}
