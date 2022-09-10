package invocationCount_in_TestNG;

import org.testng.annotations.Test;

public class Enabled_false {
	
	@Test(enabled = false)
	public void btest() {
		System.out.println("B.btest");
	}

}
