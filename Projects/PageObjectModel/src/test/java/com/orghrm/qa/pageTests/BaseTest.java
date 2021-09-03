package com.orghrm.qa.pageTests;

import static com.orghrm.qa.utility.ReadConfigProp.readProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.orghrm.qa.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	@BeforeClass
	public void setUp() {
		String appUrl = readProperty("appurl");
		String browser = readProperty("browser");

		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get(appUrl);
		loginPage = new LoginPage(driver);
	}

	@AfterClass
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
