package SeleniumSessionsByNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DriversSelenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		String url="http://demo.guru99.com/selenium/deprecated.html";
		
		driver.get(url);
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
