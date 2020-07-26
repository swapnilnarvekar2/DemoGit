package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClassPOM {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		FirstPOMDesign pom=new FirstPOMDesign();
		pom.getURL(wd);
		pom.enterUserame(wd);
		pom.enterPassword(wd);
		pom.enterLogin(wd);
		pom.enterLogout(wd);
	}

}
