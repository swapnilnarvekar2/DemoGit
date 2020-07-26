package packageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://172.16.11.2:8003/login_page.php");
		wd.findElement(By.id("search")).sendKeys("Ganpati songs");
		Thread.sleep(5000);
		wd.findElement(By.id("text")).click();
		
