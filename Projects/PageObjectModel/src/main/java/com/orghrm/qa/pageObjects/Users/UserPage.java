package com.orghrm.qa.pageObjects.Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orghrm.qa.pageObjects.HomePage;

public class UserPage extends HomePage {
	private By addUserBtn = By.id("btnAdd");
	/* Add user Form Elmns */
	private By user_role = By.id("systemUser_userType");
	private By empName = By.id("systemUser_employeeName_empName");
	private By userName = By.id("systemUser_userName");
	private By password = By.id("systemUser_password");
	private By confirmPwd = By.id("systemUser_confirmPassword");
	private By btnSave = By.id("btnSave");

	public UserPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAddUserElm() {
		return getWebElement(addUserBtn);
	}

	public WebElement getAddUserBtn() {
		return getWebElement(addUserBtn);
	}

	public WebElement getUser_role() {
		return getWebElement(user_role);
	}

	public WebElement getEmpName() {
		return getWebElement(empName);
	}

	public WebElement getUserName() {
		return getWebElement(userName);
	}

	public WebElement getPassword() {
		return getWebElement(password);
	}

	public WebElement getConfirmPwd() {
		return getWebElement(confirmPwd);
	}

	public WebElement getBtnSave() {
		return getWebElement(btnSave);
	}

	/****************** AddUserLinkClick **************************/
	public void clickAddUser() {
		getAddUserElm().click();
	}

	public UserListingPage addUser() {
		clickAddUser();
		
		/*Add user Actions */
		getUser_role().sendKeys("ESS");
		getEmpName().sendKeys("Jasmine Morgan");
		getUserName().sendKeys("smqa");
		getPassword().sendKeys("SMQA@123");
		getConfirmPwd().sendKeys("SMQA@123");
		getBtnSave().click();
		return new UserListingPage();
	}
}
