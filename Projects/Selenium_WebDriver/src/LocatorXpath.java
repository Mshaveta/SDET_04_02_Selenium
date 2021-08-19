import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {
	static WebDriver driver;// null

	public void launchBrowser() {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();// complex Object---
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	public void verifyLogoAndGetAttrValue() {
		//to check thr logo image is present or not
		boolean isPresent = driver
				.findElement(
						By.xpath("//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"))
				.isDisplayed();
		System.out.println(isPresent);
		
		//if image elmn is present
		if (isPresent) { //if(true){}
			// to get the value of src attribute of img tag
			String source = driver
					.findElement(By.xpath(
							"//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"))
					.getAttribute("src");
			System.out.println("Image Source -" + source);
		}
		
		
		String linkUrl = driver
		.findElement(
				By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"))
		.getAttribute("href");
		System.out.println("Forgot pwd Link Url - "+linkUrl);
	}
	
	public void getLinkTextByXpath() {
		//get the text of elemnets enclosed between apired tag
		String linkText = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
		System.out.println(linkText);
	}

	public static void main(String[] args) throws InterruptedException {

		LocatorXpath ld = new LocatorXpath();
		ld.launchBrowser();
		//ld.verifyLogoAndGetAttrValue();
		
		ld.getLinkTextByXpath();
		
		Thread.sleep(5000);
		driver.close();

	}
}
