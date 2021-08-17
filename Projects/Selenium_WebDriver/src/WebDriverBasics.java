import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	WebDriver driver;//null
	public   void launchBrowser() {
		// 1. Task - Browser launch
		// Step1: Get the path of chrome Driver
		// Absolute path
		// String driverPath =
		// "D:\\2021\\Batches_DATA\\SDET_0402\\LearnSel_0402\\Selenium_WebDriver\\src\\drivers\\chromedriver.exe";
		// D:\2021\Batches_DATA\SDET_0402\LearnSel_0402\Selenium_WebDriver\src\drivers\chromedriver.exe
		// Step1:
		// relative Path-Dynamic path
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";

		// Step2: set the driver property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// Step3: Launching the chrome browser
		driver = new ChromeDriver();// complex Object---

		driver.manage().window().maximize();
	}
	
	public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void verifyTtlUrl() {
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("Current Url - "+currentUrl + " Title - "+ title);
	}

	public static void main(String[] args) {
		WebDriverBasics wdb = new WebDriverBasics();
		wdb.launchBrowser();
		wdb.launchApp();
		wdb.verifyTtlUrl();
	}
}
