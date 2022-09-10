package beforesuite_AfterSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite {
  
	  
	  
	  @BeforeSuite
		public void b_suite() {
			System.out.println("This is @BeforeSuite method");
		}
		
		@AfterSuite
		public void a_suite() {
			System.out.println("This is @AfterSuite method");
		}
		
		@BeforeMethod
		public void login1() {
			System.out.println("This is @Before method ");
		}
		@AfterMethod
		public void logout1() {
			System.out.println("This is @After method");
		}
		
		@BeforeClass
		public void login2() {
			System.out.println("This is @Before Class");
		}
		@AfterClass
		public void logout2() {
			System.out.println(" This is @After class");
		}
		
		@BeforeTest
		public void login() {
			System.out.println("This is @Before Test");
		}
		@AfterTest
		public void logout() {
			System.out.println("This is @After Test");
		}
		
		@Test(priority=2)
			public void verify_2() {
				System.out.println("This is test with priority 2");
			}
			
			@Test(priority=1)
			public void verify_1() {
				System.out.println("This is test with priority 1");
			}
			@Test(priority=3)
			public void verify_3() {
				System.out.println("This is test with priority 3");
			}
  }
		
		
		
  

