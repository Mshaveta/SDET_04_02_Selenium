package com.orghrm.qa.pageTests;

import org.testng.annotations.Test;

import com.orghrm.qa.pageObjects.HomePage;
import com.orghrm.qa.pageObjects.Users.UserPage;

public class UserTest extends BaseTest{
	HomePage homePage;
	UserPage userPage ;
	@Test
	public void addUser() {
		//Step1: DOLogin
		homePage = loginPage.doLogin("Admin", "admin123");
		//Step2: click on Admin link
		userPage = homePage.clickAdminLink();
		//Step3: click on Add USer button
		userPage.addUser();
		//Step4: Logout
		homePage.doLogout();
		
	}
}
