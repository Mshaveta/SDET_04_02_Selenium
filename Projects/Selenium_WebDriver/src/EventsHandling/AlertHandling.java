package EventsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertHandling {
	WebDriver driver;// null

	@BeforeClass
	public void launchBrowser() throws InterruptedException {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

	}

	@Test
	public void alert() throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		String expecMsg = "You clicked a button";
		if (expecMsg.equalsIgnoreCase(alertMsg)) {
			Thread.sleep(2000);
			alt.accept();// for OK button
		}

	}

	@Test
	public void confirmBox() throws InterruptedException {
		driver.findElement(By.id("confirmButton")).click();
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		String expecMsg = "Do you confirm action?";
		if (expecMsg.equalsIgnoreCase(alertMsg)) {
			Thread.sleep(2000);
			alt.dismiss(); // to press cancel button
		}

	}

	@Test
	public void promptBox() throws InterruptedException {
		driver.findElement(By.id("promtButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Prompt Box Values...."); // might be it will not work in chrome, bt can work in FF
		Thread.sleep(2000);
		alt.accept();

	}

}
