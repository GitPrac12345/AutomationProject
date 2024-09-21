package test_cases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;

	@Parameters("browser") // @Parameters("url")
	

	  @BeforeMethod
	  public void setUp(String br) {
	  
	if(br.equals("chrome")) {
	  
	  driver=new ChromeDriver();
	  
	}else if(br.equals("edge"))

	{
		driver = new EdgeDriver();

	}else
	{
		driver = new FirefoxDriver();
	}
	  driver.get("https://tutorialsninja.com/demo");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void tearDown() { 
		System.out.println("driver closed");
		driver.quit();
		System.out.println("AfterMethod");

	  }
	
	
	
	
	
	
	
	
	
	
	
	

}
