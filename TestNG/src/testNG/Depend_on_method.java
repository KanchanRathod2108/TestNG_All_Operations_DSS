package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend_on_method {
  @Test
  public void login() {
	  System.out.println("Login Sucessfully");
  }
  @Test
  public void logout() {
	  System.out.println("Logout Sucessfully");
  }
  @Test(dependsOnMethods= {"advancedSerach"})
  public void serach() {
	  System.out.println("Serach Sucessfully");
  }
  @Test
  public void advancedSerach() {
	  Assert.assertEquals("Gmail", "Gmail1");
  }
}
