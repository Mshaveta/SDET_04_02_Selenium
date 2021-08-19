import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatortagName {
	WebDriver driver;// null

	public void launchBrowser() {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();// complex Object---
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}
	
	
	public void locateMultipleLinkstagName() {
		int count = driver.findElements(By.tagName("img")).size();
		System.out.println(count);
		driver.findElements(By.tagName("img")).get(3).click();
	}
	
	public static void main(String[] args) {
		
		LocatortagName ld = new LocatortagName();
		ld.launchBrowser();
		 
		ld.locateMultipleLinkstagName();
		 
	}
}
