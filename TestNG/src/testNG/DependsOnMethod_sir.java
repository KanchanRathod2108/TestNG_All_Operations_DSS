package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod_sir {
	@Test
	  public void a() {
		  System.out.println("a method");//pass
	  }
	  @Test
	  public void b() {
		  System.out.println("b method");//pass
	  }
	  
	@Test(dependsOnMethods= {"d"})//now C is depends on D method
	public void c() {
		  System.out.println("c method");//skipped
	}
	@Test
	public void d() {
		  Assert.assertEquals("k", "m");  //failed
	}
	}