package com.raghib.pomwithpagefactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.raghib.selenium.BaseClass;

/*
 * REFERENCE
https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/
*/
public class MainClass extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "http://www.google.com";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);

		// Creating object of GoogleHomePage and driver instance is passed as parameter to
		// constructor of GoogleHomePage.Java
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);

		// Type googleSearchBox
		googleHomePage.googleSearchBox("selenium");
		// googleSearchBox value is passed as parameter which in turn will be assigned to the
		// method in GoogleHomePage.Java

		// Quit browser
		Thread.sleep(3000);
		BaseClass.quitDriver();
	}
}
