package alwaysRun;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlwaysRun_True {

	@BeforeMethod
	  public void a() {
		  System.out.println("I am Before method");
	  }
	  @AfterTest
	  public void b() {
		  System.out.println("I am After method");
	  }
	  
	@Test(dependsOnMethods= {"d"},alwaysRun=true)
	public void c() {
		  System.out.println("c method");
	}
	@Test
	public void d() {
		  Assert.assertEquals("ka", "n");
	}
}
