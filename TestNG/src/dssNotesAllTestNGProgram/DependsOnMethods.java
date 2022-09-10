package dssNotesAllTestNGProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void login() {
		System.out.println("Login Succesfully");
	}
	@Test
	public void logout() {
		System.out.println("Logout Succesfully");
	}
	
	@Test(dependsOnMethods={"advanced Search"})
		public void serach() {
			System.out.println("Serach Successfully");
		}
	@Test
	public void advancedSearch() {
		Assert.assertEquals("Ka", "n");
	}
	
	
	
	
	
}
