package priority;

import org.testng.annotations.Test;

public class Priority_Execute {
  @Test
  public void a() {
	  System.out.println("a method");
  }
  @Test
  public void b() {
	  System.out.println("b method");
  }
  
@Test(priority=2)
public void c() {
	  System.out.println("c method");
}
@Test(priority=1)
public void d() {
	  System.out.println("d method");
}
}
