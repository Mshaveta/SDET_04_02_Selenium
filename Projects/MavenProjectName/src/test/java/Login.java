import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;// null

	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
//		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

	}

}
