package SeleniumSessionsByNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DriversSelenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/popuptest2.html");
		
		driver.close();

	}

}
