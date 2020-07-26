package assertionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage 
{
	@Test
	public void verifyError() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		wd.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		
		Thread.sleep(2000);
		
		String actualError=wd.findElement(By.xpath("//div[text()=\"Enter an email or phone number\"]")).getText();
		
		String expectedError="Enter an email or phone number";
		
		Assert.assertEquals(actualError, expectedError);
		
		System.out.println("Error message verified");
	}
}
