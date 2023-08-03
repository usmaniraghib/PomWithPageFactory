package com.raghib.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * REFERENCE
https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/
*/
public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://www.google.com";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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
		driver.quit();

	}

}
