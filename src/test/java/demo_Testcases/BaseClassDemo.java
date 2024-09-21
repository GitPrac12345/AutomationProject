package demo_Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassDemo {

	
	
	@BeforeSuite
	public void setUpdemo() {

		
		System.out.println("BeforeSuitdemo");
}
	@AfterSuite
	public void tearDowndemo() {
		System.out.println("AfterSuitDemo");

	}
}
