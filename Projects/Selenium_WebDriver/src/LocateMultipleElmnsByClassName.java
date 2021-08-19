import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateMultipleElmnsByClassName {
	WebDriver driver;// null

	public void launchBrowser() {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();// complex Object---
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	public void login() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser");
	}
	
	public void locateMultipleFields() {
		int count = driver.findElements(By.className("formInputText")).size();
		System.out.println(count);
		driver.findElements(By.className("formInputText")).get(2).sendKeys("tester@123");
	}
	
	public static void main(String[] args) {
		
		LocateMultipleElmnsByClassName ld = new LocateMultipleElmnsByClassName();
		ld.launchBrowser();
		ld.login();
		ld.locateMultipleFields();
		 
	}
}
