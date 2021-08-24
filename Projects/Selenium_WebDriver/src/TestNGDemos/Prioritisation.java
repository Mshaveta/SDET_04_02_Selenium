package TestNGDemos;

import org.testng.annotations.Test;

public class Prioritisation {
	@Test(priority=1)
	public void launchBrowser() {
		System.out.println("launchBrowser......");
	}

	@Test
	public void appLaunch() {
		System.out.println("appLaunch");
	}

	@Test
	public void login() {
		System.out.println("login.....");
	}

	@Test(priority=4)
	public void addUser() {
		System.out.println("addUser........");
	}
}
