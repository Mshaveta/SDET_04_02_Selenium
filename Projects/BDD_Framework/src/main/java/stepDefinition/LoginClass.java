package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginClass {
	WebDriver driver;
	@Given("Launch the application with valid URL")
	public void launch_app() {
		System.out.println("Launch the application with valid URL");
//		 WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_valid_Credentials (String uname, String pwd) {
		System.out.println("user_enters_valid_Credentials");
//		driver.findElement(By.id("txtUsername")).sendKeys(uname);
//		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}
	
	@And("click on Login button")
	public void click_on_Login_button() {
		System.out.println("click_on_Login_button");
		//driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user should be redirect to Home page")
	public void user_should_be_redirect_to_Home_page() {
		System.out.println("user_should_be_redirect_to_Home_page");
	    // String dashBoardTxt = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	    //Assert.assertEquals("Dashboard", dashBoardTxt);
	}
	
	@Then("check the availbility of all the elmns")
	public void check_the_availbility_of_all_the_elmns() {
	     System.out.println("check the availbility of all the elmns");
	}
	
}
