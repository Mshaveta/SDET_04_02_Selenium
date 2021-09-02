package com.orghrm.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By unameTxtFld = By.id("txtUsername");
	private By pwdTxtFld = By.id("txtPassword");
	private By loginBtn = By.id("btnLogin");

	private WebElement getUnameTxtFld() {
		return getWebElement(unameTxtFld);//driver.findElement(By.id("txtUsername"))
	}

	private WebElement getPwdTxtFld() {
		return getWebElement(pwdTxtFld);
	}

	private WebElement getLoginBtn() {
		return getWebElement(loginBtn);
	}

	public HomePage doLogin(String uname, String pwd) {
		getUnameTxtFld().sendKeys(uname);
		getPwdTxtFld().sendKeys(pwd);
		getLoginBtn().click();
		HomePage hp = new HomePage(driver);
		return hp;

	}

 
}
