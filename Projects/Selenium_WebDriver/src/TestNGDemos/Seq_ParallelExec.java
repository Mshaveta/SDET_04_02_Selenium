package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Seq_ParallelExec {
	WebDriver driver;// null

	@Parameters("browser") // chrome
	@Test
	public void launchBrowser(String browserName) throws InterruptedException {
		System.out.println(browserName);

		if (browserName.equalsIgnoreCase("firefox")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

	}

	@Test(dependsOnMethods = "launchBrowser")
	public void login() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
}
