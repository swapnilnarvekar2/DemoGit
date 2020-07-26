package SeleniumSessionsByNaveen;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com");

		driver.findElement(By.xpath("//input[@label='Search for anything']")).sendKeys("Mobiles");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		
		Select option = new Select(element);
		List<WebElement> elementcount = option.getOptions();
		
		int size=elementcount.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.println(elementcount.get(i).getText());
		}
		
		option.selectByVisibleText("Consumer Electronics");
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		driver.findElement(By.linkText("Radio Communication")).click();
		
		List<WebElement> listitems= driver.findElements(By.className("s-item__link"));
		
		int count = 0;
		for(int i=0; i<listitems.size(); i++)
		{
			System.out.println(listitems.get(i).getText());
			count++;
		}
		
		System.out.println("Total items = "+count);
		
		driver.quit();
	
		
		
		
	}

}
