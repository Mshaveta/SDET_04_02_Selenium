package com.orghrm.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class BasePage {
	WebDriver driver;// instance variable / null

	public BasePage(WebDriver driver) {
		this.driver=driver;//instance var = localVar
	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public WebElement getWebElement(By element) {
		return driver.findElement(element);
	}
	
	

	
}
