package depend;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend0nMethod {

	
	
		
		@Test
		  public void a() {
			  System.out.println("a method");
		  }
		  @Test
		  public void b() {
			  System.out.println("b method");
		  }
		  
		@Test(dependsOnMethods= {"d"})
		public void c() {
			  System.out.println("c method");
		}
		@Test
		public void d() {
			  Assert.assertEquals("ka", "n");
		}
}
