package com.orghrm.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
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

	public void doLogin() {
		getUnameTxtFld().sendKeys("admin");
		getPwdTxtFld().sendKeys("admin123");
		getLoginBtn().click();

	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.doLogin();

	}
}
