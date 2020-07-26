package keywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Operations 
{
	public void getURL(WebDriver wd)
	{
		wd.get("https://erp.agamedu.in/Login.jsp");
	}
	
	public void enterUserame(WebDriver wd,String user)
	{
		wd.findElement(By.xpath("//input[@name='userName']")).sendKeys(user);
	}
	
	public void enterPassword(WebDriver wd,String pwd)
	{
		wd.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	
	public void enterLogin(WebDriver wd)
	{
		wd.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public void enterLogout(WebDriver wd) throws Exception
	{
		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[@class='btn btn-link pull-right']")).click();
		wd.findElement(By.xpath("//div[@class='popupContent']/table/tbody/tr[2]/td/a[text()=' Log Out ']")).click();
	}
}
