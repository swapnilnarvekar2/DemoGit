package hybridDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://erp.agamedu.in/Login.jsp");
		wd.findElement(By.xpath("//input[@name='userName']")).sendKeys("SIP006724");
		wd.findElement(By.xpath("//input[@name='password']")).sendKeys("Swapnil@4033");
		wd.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		
		List<WebElement> WebElement=wd.findElements(By.className("add-on"));
		
		for(WebElement product:WebElement)
		{
			System.out.println(product.getText());
			product.click();
			System.out.println("Clicked"+product.getText());
			System.out.println("*******************");
		}
		
		//wd.findElement(By.xpath("//span[contains(text(),'My Batches')]")).click();
		wd.findElement(By.xpath("//a[@class='btn btn-link pull-right']")).click();
		wd.findElement(By.xpath("//div[@class='popupContent']/table/tbody/tr[2]/td/a[text()=' Log Out ']")).click();
	}
}

/*SIP006724
Swapnil@4033
*/