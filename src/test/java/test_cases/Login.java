
  package test_cases;
  
  import java.time.Duration;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.testng.annotations.AfterMethod; import
  org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;

import junit.framework.Assert;
  
  public class Login extends BaseClass {
  
  
  
  @Test(priority = 1)
  public void validUsername_ValidPassword() {
  
  // My account dropdown
  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click(); 
  // Login button
  driver.findElement(By.xpath("//a[normalize-space()='Login']")).click(); 
  //userName
  
  
  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
  "aabbccww@gmail.com");
  
  // passWord
  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(
  "Anakanakanak");
  
  // Login_click
  driver.findElement(By.xpath("//input[@value='Login']")).click();
  
  String expTitle = "My Account"; String actTitle = driver.getTitle();
  Assert.assertEquals(actTitle, expTitle);
  
  }
  
  @Test(priority = 2) 
  public void validusername_invalidpassword() {
  
  // My account dropdown
  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
  // Login button
  driver.findElement(By.xpath("//a[normalize-space()='Login']")).click(); //
//  userName
  
  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
  "aabbccww@gmail.com");
  
  // passWord
  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(
  "An34akanakanak");
  
  // Login_click
  driver.findElement(By.xpath("//input[@value='Login']")).click();
  
  String expTitle1 = "Warning: No match for E-Mail Address and/or Password.";
  
  String actTitle1 = driver.findElement(By.
  xpath("//div[@class='alert alert-danger alert-dismissible']")) .getText();
  Assert.assertTrue(actTitle1.equals(expTitle1)); // Assert.fail("Test2 fail");
  
  }
  
  @Test(priority = 3)
  public void inValidusername_validpassword() {
  
  // My account dropdown
  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click(
  ); // Login button
  driver.findElement(By.xpath("//a[normalize-space()='Login']")).click(); //
 // userName
  
  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
  "aabbc76575cww@gmail.com");
  
  // passWord
  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(
  "Anakanakanak");
  
  // Login_click
  driver.findElement(By.xpath("//input[@value='Login']")).click();
  
  String expTitle2 = "Warning: No match for E-Mail Address and/or Password.";
  
  String actTitle2 = driver.findElement(By.
  xpath("//div[@class='alert alert-danger alert-dismissible']")) .getText();
  Assert.assertEquals(actTitle2, expTitle2); // Assert.fail("Test2 fail");
  
  }
  
  @Test(priority = 4) 
  public void inValidusername_inValidpassword() { 
	  // Myaccount dropdown
  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click(
  ); // Login button
  driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
  
  // userName
  
  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
  "aabbc76575cww@gmail.com");
  
  // passWord
  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(
  "An34akanakanak");
  
  // Login_click
  driver.findElement(By.xpath("//input[@value='Login']")).click();
  
  String expTitle3 = "Warning: No match for E-Mail Address and/or Password.";
  
  String actTitle3 = driver.findElement(By.
  xpath("//div[@class='alert alert-danger alert-dismissible']")) .getText();
  Assert.assertEquals(actTitle3, expTitle3); // Assert.fail("Test2 fail");
  
  }
  
  @Test(priority = 5)
  public void login_without_credentials() {
	  // My account dropdown
  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click(
  ); // Login button
  driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
  
  // Login_click
  driver.findElement(By.xpath("//input[@value='Login']")).click();
  
  String expTitle4 = "Warning: No match for E-Mail Address and/or Password.";
  
  String actTitle4 = driver.findElement(By.
  xpath("//div[@class='alert alert-danger alert-dismissible']")) .getText();
  Assert.assertTrue(actTitle4.equals(expTitle4)); // Assert.fail("Test2 fail");
  
  
  
  
  
  }
  }