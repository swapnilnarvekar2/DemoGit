package assertionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleDemo
{
	@Test
	public void verifyTitle() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/?gfe_rd=cr&ei=XDL2VoXcI6TT8gfWsKyIAw&gws_rd=ssl");
		
		String actualTitle=wd.getTitle();
		
		String expectedTitle="Google";
		
		Assert.assertEquals(actualTitle, expectedTitle);   //This is for entire exact match title
		
		//Assert.assertTrue(actualTitle.contains("Goo"));			//This is to match some part of title
		
		System.out.println("Title Verified");
		
		wd.quit();
		
	}
}
