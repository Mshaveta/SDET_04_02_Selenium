package TestNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert sa = new SoftAssert(); // it will perform E2E execution
	
	@Test
	public void verifyTitle() {
		System.out.println("Start Execution....");
		String expcTitle = "facebook";
		String actualTitle = "Facebook123";
		
		sa.assertEquals(actualTitle, expcTitle,"Expected and Actual title should be same!");
		
		System.out.println("End Execution....");
		sa.assertAll();//for correct report generation
	}
	
	 
}
