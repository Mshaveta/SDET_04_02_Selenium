package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DiffBetweenPriorityDependsMeth {
	WebDriver driver;// null
	@Test
	public void launchBrowser() throws InterruptedException {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chromedriver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

	}

	@Test(dependsOnMethods="launchBrowser")
	public void login() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
}
