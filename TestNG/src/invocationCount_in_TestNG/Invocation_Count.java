package invocationCount_in_TestNG;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("Invocation count demo");
	}

}
