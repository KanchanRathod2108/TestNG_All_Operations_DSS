package invocationCount_in_TestNG;

import org.testng.annotations.Test;

public class TimeOut_in_miliSecond {

	@Test
	public void ContactVerify() {
		System.out.println("Contract validation is sucessful");
	}
	@Test(timeOut=1000)
	public void LandingPage() {
		System.out.println("Landing page verification is sucessful");
	}
	
	@Test
	public void LoanContact() {
		System.out.println("Loan contact details verification is sucessful");
	}
}
