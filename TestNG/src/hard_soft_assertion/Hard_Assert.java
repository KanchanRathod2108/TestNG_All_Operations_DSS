package hard_soft_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {

	
	@Test
	public void verifyPageTitile() {
		String excepted_Titile = "Google";
		String acutal_Titile = "Google1";
		System.out.println("Test case execution started");
		
		Assert.assertEquals(acutal_Titile, excepted_Titile);
	
		System.out.println("Test csese execution Finished");
	}
}
