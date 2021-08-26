package TestNGDemos;

import org.testng.annotations.Test;

public class GroupingDemo {
	@Test(groups = "smoke")
	public void smokeTC1() {
		System.out.println("smokeTC1");
	}

	@Test(groups = "sanity")
	public void sanityTC1() {
		System.out.println("SanityTC1");
	}

	@Test(groups = "functional")
	public void functionalTC1() {
		System.out.println("functional TC1");
	}

	@Test(groups = "regression")
	public void regressionTC1() {
		System.out.println("regression");
	}

	@Test(groups = "smoke")
	public void smokeTC2() {
		System.out.println("smokeTC2");
	}
	
	
	@Test(groups = {"smoke","sanity","functional"})
	public void aTestCase() {
		System.out.println("aTestCase......");
	}

}
