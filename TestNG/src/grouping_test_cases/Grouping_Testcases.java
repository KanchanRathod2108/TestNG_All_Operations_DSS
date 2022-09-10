package grouping_test_cases;

import org.testng.annotations.Test;

public class Grouping_Testcases {
  
	@Test(groups= {"sanity","regression"},priority=1)
	public void login() {
		System.out.println("Login successfully");
	}
	
	@Test(groups= {"sanity","regression"},priority=10)
		public void logout() {
			System.out.println("Logout succesfully");
		}
		@Test(groups= {"sanity"},priority=4)
			public void search() {
				System.out.println("Serach Succesfully");
			}
			@Test(priority=2)
			public void addVendor() {
				System.out.println("Add vendor succesfully");
			}
			@Test(groups= {"regression"},priority=3)
			public void advanedSerach() {
				System.out.println("Advaned Serach sucessfully");
			}
			@Test(groups= {"sanity","regression"},priority=5)
				public void prepaidRecharge() {
					System.out.println("prepaid Recharge successfully");
				}
			@Test(groups= {"regression"},priority=6)
			public void billPayments() {
				System.out.println("bill Payments succefully");
			}
				
			}
		

