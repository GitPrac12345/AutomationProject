package dataProviderDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Data_Driven {
	WebDriver driver = null;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}

	@Test(dataProvider = "passingData")
	public void validCredentials(String userName, String password) {

		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@AfterMethod
	public void tearDown() {
		if(driver!=null){
		    driver.quit();
		}
	}

	@DataProvider
	public String[][] passingData() {

		String[][] credentials = { { "abcdefgh123@123gmail.com", "Abcdefg123@123" },
				{ "abcdefgh123@123456gmail.com", "Abcdefg123@123" },
				{ "abcdefgh123@123456789gmail.com", "Abcdefg123@123" } };

		return credentials;

	}

}
