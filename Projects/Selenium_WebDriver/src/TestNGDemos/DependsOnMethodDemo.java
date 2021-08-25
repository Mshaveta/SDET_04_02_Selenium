package TestNGDemos;

import org.testng.annotations.Test;

public class DependsOnMethodDemo {
	@Test
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	
	@Test(dependsOnMethods="launchBrowser")
	public void appLaunch() {
		System.out.println("appLaunch");
	}
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login....");
	}
	
	@Test (priority=2)
	public void logout() {
		System.out.println("logOut.....");
	}
}
