package packageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ebay.in/");
		
		Actions a=new Actions(wd);
		
		a.moveToElement(wd.findElement(By.xpath("//*[@id=\"navigationFragment\"]/div/table/tbody/tr/td[6]/a")));
		a.build().perform();
		

	}

}
