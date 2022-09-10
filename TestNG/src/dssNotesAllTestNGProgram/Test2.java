package dssNotesAllTestNGProgram;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeTest
	public void login() {
		System.out.println("Test Login Succesfully");
	}
	@AfterTest
	public void logout() {
		System.out.println("Test Logout Succesfully");
	}
	@Test(priority=2)
	public void verifyTitle() {
		System.out.println("Verify Title method");
	}
	@Test(priority=1)
	public void verifyButton()
	{
		System.out.println("ABCD");
	}
	@Test(priority=3)
	public void verifyDropdown()
	{
		System.out.println("Highest Package");
	}
	
}
