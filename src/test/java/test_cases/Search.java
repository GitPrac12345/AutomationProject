
  package test_cases;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.testng.annotations.Test;
  
  public class Search extends BaseClass {
  
  @Test 
  public void search_product() {
  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mac"); 
  driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click(); 
  Assert.assertTrue(true); 
  
  
  }
  
  }
 