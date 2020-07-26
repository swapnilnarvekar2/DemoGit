package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest 
{
	WebDriver driver;
	
	@BeforeTest
	 public void launchBrowser()
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWAPNIL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	
	@Test
	public void verifyTitle() 
	{
		driver.get("https://www.google.co.in/");
	}
}
