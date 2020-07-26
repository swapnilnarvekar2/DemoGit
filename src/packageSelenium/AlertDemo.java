package packageSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		//wd.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button")).click();   for Confirmation alert
		
		wd.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button")).click();
		
		Alert a=wd.switchTo().alert();
		//a.accept();
		Thread.sleep(5000);
		String text=a.getText();
		//a.dismiss();
		
		a.sendKeys("Yes i agree");
		Thread.sleep(5000);
		System.out.println("Alert text is= "+text);
		a.accept();
		
		
	}

}
