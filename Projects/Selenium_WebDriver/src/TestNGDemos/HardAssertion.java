package TestNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void verifyTitle() {
		System.out.println("Start Execution....");
		String expcTitle = "facebook";
		String actualTitle = "facebook";
//		if(expcTitle.equals(actualTitle)) {
//			System.out.println("passed");
//		}else {
//			System.out.println("Failed");
//		}
		
		Assert.assertEquals(actualTitle, expcTitle,"Expected and Actual title should be same!");
		
		System.out.println("End Execution....");
	}
	
	@Test
	public void assertionMethods() {
		System.out.println("Start TestCase2....");
		 
		
		Assert.assertTrue(12>10);
		Assert.assertFalse(12>10);
		 
		System.out.println("End Execution....");
	}
}
