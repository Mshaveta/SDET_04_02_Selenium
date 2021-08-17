import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	WebDriver driver;// null

	public void launchBrowser() {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();// complex Object---
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	public void loginByIdLoc() {
//		driver.findElement(By.id("txtUsername")).isDisplayed();
//		driver.findElement(By.id("txtUsername")).clear();
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		By userName = By.id("txtUsername");
//		By pwd = By.id("txtPassword");
//		By loginBtn = By.id("btnLogin");

//		WebElement unameTxt = driver.findElement(By.id("txtUsername"));
//		unameTxt.sendKeys("Admin");

		// or

		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

	}
	
	public void locateByClassName() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
	}

	public void linkTextLocator() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		//clikc on browser's back button
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		driver.navigate().to("https://www.orangehrm.com/");
	}
	
	 

	public static void main(String[] args) {
		LocatorsDemo ld = new LocatorsDemo();
		ld.launchBrowser();
		ld.locateByClassName();
		// ld.loginByIdLoc();
		//ld.linkTextLocator();
		ld.quitBrowser();

	}

	public void quitBrowser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}

}
