package com.orghrm.qa.pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orghrm.qa.pageObjects.HomePage;

public class LoginTest extends BaseTest {
	SoftAssert sa = new SoftAssert();

	@Test
	public void verifyLogin() throws InterruptedException {
		// Step1: Login to the app
		HomePage hp = loginPage.doLogin("Admin", "admin123");

		// Step2: Verify the homedashboard label
		String expecLbl = "Dashboard";
		String actualLblVal = hp.doGetHomeDash();
		sa.assertEquals(actualLblVal, expecLbl);
		sa.assertAll();

	}
	
	
}
