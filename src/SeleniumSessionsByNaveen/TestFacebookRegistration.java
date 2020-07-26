package SeleniumSessionsByNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DriversSelenium\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		String baseUrl="http://demo.guru99.com/selenium/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
		
		


	}

}
