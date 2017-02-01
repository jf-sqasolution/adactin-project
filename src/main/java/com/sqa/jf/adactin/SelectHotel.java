/**
 * File Name: SelectHotel.java<br>
 * LastName, FirstName<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 24, 2016
 */
package com.sqa.jf.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * SelectHotel //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class SelectHotel {

	private static WebDriver driver;

	/**
	 * @param driver
	 */
	public SelectHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
