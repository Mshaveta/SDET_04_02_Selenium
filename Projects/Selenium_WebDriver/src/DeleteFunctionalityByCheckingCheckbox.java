import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteFunctionalityByCheckingCheckbox {
	WebDriver driver;// null

	public void launchBrowser() throws InterruptedException {

		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

	}
	
	public void login() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
	
	public void deleteUser() {
		//click on Admin link
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//get the usernames of all the elements
		int count = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td/a")).size();
		//System.out.println(count);
		 
		
		for(int i=1;i<=count;i++) {
			String linkText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td/a")).getText();
			System.out.println("Username - "+linkText);
			if(linkText.equals("Alice")) {
				driver.findElement(By.xpath("//a[text()='Alice']/parent::td/preceding-sibling::td/input")).click();
				break;
				
			}
		}
		
		System.out.println("exit from loop");
		
	}

	public static void main(String[] args) throws InterruptedException {
		DeleteFunctionalityByCheckingCheckbox obj = new DeleteFunctionalityByCheckingCheckbox();
		obj.launchBrowser();
		obj.login();
		obj.deleteUser();
	}
}
