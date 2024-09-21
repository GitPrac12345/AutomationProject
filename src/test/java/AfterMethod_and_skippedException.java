import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AfterMethod_and_skippedException {
	
	WebDriver driver=null;
	
	@Test(enabled=false)
	public void valid_Username_Valid_Password() {
     driver=new ChromeDriver(); 
     driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//userName
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("aabbccww@gmail.com");
		
		//passWord
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Anakanakanak");
		
		//Login_click
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
        String expTitle = "My Account";			
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	
	}
	
	@Test
	public void skipTest() {
		throw new SkipException("Test skipped");
	}
	@Test
	public void valid_Username_InValid_Password() {
	     driver=new ChromeDriver(); 
	     driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//userName
			
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("aabbccww@gmail.com");
			
			//passWord
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("An34akanakanak");
			
			//Login_click
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
	        String expTitle1 ="Warning: No match for E-Mail Address and/or Password.";
		
	        String actTitle1=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			Assert.assertEquals(actTitle1, expTitle1);
		
		}
		

    @AfterTest
	public void tear_Down() {
		driver.quit();
	}
	
	
	
	
	
	
}
