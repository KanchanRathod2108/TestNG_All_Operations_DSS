package dssNotesAllTestNGProgram;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_Method_After_Method {

	
	@BeforeMethod
	public void login() {
		System.out.println("Login Succesfully");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout Succesfully");
	}
	@Test(priority=2)
		public void addProduct() {
			System.out.println("Add product succesfully");
		}
		@Test(priority=1)
			public void addVendor() {
				System.out.println("Add Vendorsuccesfully");
			}
			@Test(priority=3)
				public void addCurrency() {
					System.out.println("Add Currency succesfully");
				}
				
	}
		
