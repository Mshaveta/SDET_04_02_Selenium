import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllLinks {
	WebDriver driver;// null

	public void launchBrowser() {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();// complex Object---
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	public void linksClickability() throws InterruptedException {
		//Count size of all the links
		int count = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li/a")).size();
		System.out.println("Count- "+count);
		
	 
		for(int i=1;i<=count;i++) {
			//String linkText = driver.findElement(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li["+i+"]/a")).getText();
			//System.out.println(linkText);
			
			String linkUrl = driver.findElement(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li["+i+"]/a")).getAttribute("href");
			//System.out.println(linkUrl);
			driver.navigate().to(linkUrl);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl()+" - "+driver.getTitle());
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			
		}
	}
		 

	public static void main(String[] args) throws InterruptedException {
		ClickAllLinks ld = new ClickAllLinks();
		ld.launchBrowser();
		ld.linksClickability();
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
