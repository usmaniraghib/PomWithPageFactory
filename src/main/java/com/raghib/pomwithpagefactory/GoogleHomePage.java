package com.raghib.pomwithpagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Shortcut to import statement {ctrl+shift+o}

public class GoogleHomePage {
	WebDriver driver;

	// Locator for Email Address
	@FindBy(how = How.ID, using = "APjFqb")
	private WebElement SearchBoxAddress;

	// Constructor
	// Gets called when object of this page is created in MainClass.java
	public GoogleHomePage(WebDriver driver) {
		// "this" keyword is used here to distinguish global and local variable "driver"
		// gets driver as parameter from MainClass.java and assigns to the driver
		// instance in this class

		this.driver = driver;

		PageFactory.initElements(driver, this);
		// Initializes WebElements declared in this class using driver instance.
	}

	// Method to type SearchBox
	public void googleSearchBox(String Id) {
		SearchBoxAddress.sendKeys(Id);
		SearchBoxAddress.sendKeys(Keys.ENTER);
	}
}
