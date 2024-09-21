
package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Register extends BaseClass {

	  
	@Test
	public void withoutenteranyfields() {
		// My account dropdown
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();

		// Register button
		driver.findElement(
				By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		String expText = "Warning: You must agree to the Privacy Policy!";

		String acttext = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertEquals(acttext, expText);
		System.out.println("Method executed");
	}

}
