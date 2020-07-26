package keywordDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClassKeyword {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		ReadOperation rop=new ReadOperation();
		rop.readKeywords(wd);
	
	}

}
