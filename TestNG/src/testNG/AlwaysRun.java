package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	@Test
	  public void a() {
		  System.out.println("a method");//pass
	  }
	  @Test
	  public void b() {
		  System.out.println("b method");//pass
	  }
	  
	@Test(dependsOnMethods= {"d"},alwaysRun=true)
	public void c() {
		  System.out.println("c method");//pass
	}
	@Test
	public void d() {
		  Assert.assertEquals("k", "m");  //failed
	}
	}