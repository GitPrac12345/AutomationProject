
  package demo_Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 extends BaseClassDemo  {

  @Test(priority=1)
  public void m1() 
  { System.out.println("m18");
  }
  
  @Test(priority=2)
  public void m2() { 
	  System.out.println("m28"); 
	  } 
  }
 

