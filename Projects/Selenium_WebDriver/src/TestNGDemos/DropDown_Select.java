package TestNGDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown_Select {
	WebDriver driver;// null

	@BeforeClass
	public void launchBrowser() throws InterruptedException {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}

	@Test 
	public void selectDropDown() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser");
		// way1:
		WebElement userRole = driver.findElement(By.id("systemUser_userType"));
		//userRole.sendKeys("Admin");
		// way2:
		Select user_role = new Select(userRole);
		//Method1:
		//user_role.selectByIndex(0);//select Admin opton
		//user_role.selectByValue("1");
		user_role.selectByVisibleText("Admin");

	}

	 
}
