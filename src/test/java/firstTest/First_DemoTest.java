package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_DemoTest {
	WebDriver driver=null;
	@Test
	public void firstTest() {
	
	
	 driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	
	
	
	
	
	}
}
