package com.orghrm.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private By dashbrdLbl = By.xpath("//h1[text()='Dashboard']");
	private By welcome = By.id("welcome");
	private By logoutLink = By.linkText("Logout");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private WebElement getdashbrdElmn() {
		return getWebElement(dashbrdLbl);
	}


	private WebElement getWelcomeElm() {
		return  getWebElement(welcome); 
	}

	private WebElement getLogoutElm() {
		return  getWebElement(logoutLink); 	 
	}

	/**************************** Actions Methods ************************/
	public String doGetHomeDash() {
		return getdashbrdElmn().getText();
	}
	
	public LoginPage doLogout() {
		getWelcomeElm().click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getLogoutElm().click();
		return new LoginPage(driver);
	}
}
