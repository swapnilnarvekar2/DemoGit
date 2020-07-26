package SeleniumSessionsByNaveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWAPNIL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(WebElement item:radio)
		{
			WebElement local_radio=item;
			String value=local_radio.getAttribute("value");
			System.out.println(value);
			
			if (value.equalsIgnoreCase("RUBY"))
			{
				local_radio.click();
			}
		}
		
		driver.navigate().to("https://www.facebook.com/");
		
		Select year = new Select(driver.findElement(By.id("year")));
		
		List<WebElement> elements=year.getOptions();
		
		System.out.println(elements.size());
		
		WebElement selected_value = year.getFirstSelectedOption();
		
		System.out.println("Before selection "+ selected_value.getText());
		
		year.selectByIndex(2);
		
		WebElement selected_value1 = year.getFirstSelectedOption();
		
		System.out.println("After selection "+ selected_value1.getText());
		*/
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
		Thread.sleep(5);
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		String alert_text =alt.getText();
		alt.accept();
		System.out.println(alert_text);
	}

}
