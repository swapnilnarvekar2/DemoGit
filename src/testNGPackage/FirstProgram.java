package testNGPackage;

import org.testng.annotations.Test;

import pomDemo.FirstPOMDesign;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstProgram 
{
	WebDriver wd;
	
  @Test(dataProvider = "dp",priority=1)
  public void loginDemo(String un, String pwd) throws Exception 
  {
	  FirstPOMDesign fp=new FirstPOMDesign();
	  fp.getURL(wd);
	  fp.enterUserame(wd, un);
	  fp.enterPassword(wd, pwd);
	  fp.enterLogin(wd);
	  //fp.enterLogout(wd);
	  
  }
  
  @Test(priority=3)
  public void assertEquals() 
  {
	Assert.assertEquals("Agam Educational ERP", "Agam Educational ERP");

  }
  
  @Test(priority=2)
  public void checkAdmission() throws Exception
  {
	  Thread.sleep(5000);
	  wd.findElement(By.xpath("//span[contains(text(),'My Admissions')]")).click();
	  Thread.sleep(5000);
	  wd.findElement(By.xpath("//a[text()='Thane001/7130']")).click();
	  Thread.sleep(5000);
	  wd.findElement(By.xpath("//div[contains(text(),'Profile')]")).click();
	  Thread.sleep(5000);
	  wd.findElement(By.xpath("//a[contains(text(),'Academic Details')]")).click();
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "SIP006724", "Swapnil@4033" },
      //new Object[] { "SIP0067245", "Swapnil@40" },
      //new Object[] { "SIP0067246", "Swapnil@33" },   
      //new Object[] { "SIP006724", "Swapnil@4033" },
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
	  wd=new ChromeDriver();
	  wd.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  wd.close();
  }

}
