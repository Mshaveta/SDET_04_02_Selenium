package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotationDemo {
	WebDriver driver;// null

	@Parameters({"username","password"})  
	@Test
	public void launchBrowser(String username,String pwd) throws InterruptedException {
		System.out.println(username+"- "+pwd);
		
	}

	 
}
