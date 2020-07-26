package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPOMDesign 
{
	public void getURL(WebDriver wd)
	{
		wd.get("https://erp.agamedu.in/Login.jsp");
	}
	
	public void enterUserame(WebDriver wd,String un)
	{
		WebElement elementUserName=wd.findElement(By.xpath("//input[@name='userName']"));
		elementUserName.clear();	//It just to clear so that it will not append to the previous text which is present
		elementUserName.sendKeys(un);
		
		
	}
	
	public void enterPassword(WebDriver wd,String pwd)
	{
		WebElement elementPassword=wd.findElement(By.xpath("//input[@name='password']"));
		elementPassword.clear();    //It just to clear so that it will not append to the previous text which is present
		elementPassword.sendKeys(pwd);
		
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
