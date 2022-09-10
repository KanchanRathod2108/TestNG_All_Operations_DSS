package parallel_test_execution;

import org.testng.annotations.Test;

public class Parallel_test_execution_Methods {
 
	
	@Test
	  public void testcase1() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 1 is sucessfully"+ "Thread id:" +id);
	  }
	  @Test
	  public void testcase2() {
		 
			  long id=Thread.currentThread().getId();
			  System.out.println("Test case 2 is sucessfully"+" Thread id:" +id);
	  }
	  @Test
	  public void testcase3() {
		 
			  long id=Thread.currentThread().getId();
			  System.out.println("Test case 3 is sucessfully"+ "Thread id:" +id);
	  }
	  @Test
	  public void testcase4() {
		 
			  long id=Thread.currentThread().getId();
			  System.out.println("Test case 4 is sucessfully"+ "Thread id:" +id);
	  }
}
