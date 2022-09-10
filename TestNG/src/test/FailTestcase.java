package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestcase {
  @Test
  public void A() {
	  System.out.println("method1");
  }
  @Test
  public void B() {
	  System.out.println("method2");
  }
  @Test
  public void C() {
	  System.out.println("method3");
  }
  @Test
  public void D() {
	  Assert.assertEquals("Kanchan", "kanchan");
  }
  
 }


