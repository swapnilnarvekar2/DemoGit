package packageSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;


public class SimpleForm {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("a.login")).click();
		//Thread.sleep(3000);
		/*driver.findElement(By.id("inputEmail")).sendKeys("admin@phptravels.com");
		Thread.sleep(3000);
		driver.findElement(By.id("inputPassword")).sendKeys("demoadmin");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();*/
		Select s=new Select(driver.findElement(By.id("select-demo")));
		s.selectByIndex(2);
		
		Select s1=new Select(driver.findElement(By.id("multi-select")));
		s1.selectByVisibleText("Florida");
		s1.selectByVisibleText("Texas");
		s1.selectByVisibleText("Washington");
		
		driver.findElement(By.id("printAll")).click();
		
		
		
		//  user@phptravels.com    demouser



		
		/*driver.findElement(By.id("user-message")).sendKeys("Hello Swapnil");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type=button]")).click();*/

	}

}
