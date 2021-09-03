package com.orghrm.qa.pageTests;

import static com.orghrm.qa.utility.ReadConfigProp.readProperty;

import org.testng.annotations.Test;

import com.orghrm.qa.pageObjects.HomePage;

public class HomeTest extends BaseTest {
	HomePage homePage;
	@Test
	public void LogOut() {
		//login method--loginPage
		String uname = readProperty("admin_uname");
		String pwd =readProperty("admin_pwd");
		homePage = loginPage.doLogin(uname, pwd);
		//logOut---HomePage
		homePage.doLogout();
	}

}
