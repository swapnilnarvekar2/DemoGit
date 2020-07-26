package packageSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://www.ebay.in.");
		wd.manage().window().maximize();
		wd.findElement(By.name("_nkw")).sendKeys("Apple Watches");
		
		Select s=new Select(wd.findElement(By.id("gh-cat")));
		s.selectByValue("14324");
		
		wd.findElement(By.id("gh-btn")).click();
				
		List<WebElement> webElement=wd.findElements(By.id("ListViewInner"));
	
		for(WebElement product:webElement)
		{
			
			System.out.println(product.getText());
			System.out.println("**********************************************");
		}

	}

}
