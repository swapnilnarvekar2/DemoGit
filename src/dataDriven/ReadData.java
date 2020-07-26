package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		FileInputStream file=new FileInputStream("C:\\Users\\SWAPNIL\\Desktop\\DataSet.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(file);
		XSSFSheet sh=wk.getSheet("Data");
		
		int num=sh.getLastRowNum();
		System.out.println(num);
		
		try
		{
		for(int i=1;i<=num;i++)
		{
			String a=sh.getRow(i).getCell(0).toString();
			String b=sh.getRow(i).getCell(1).toString();
			System.out.println(a+" "+b);
			
			wd.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			wd.findElement(By.xpath("//input[@type='email']")).sendKeys(a);
			wd.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
			Thread.sleep(3000);
			wd.findElement(By.xpath("//input[@type='password']")).sendKeys(b);
			wd.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
			Thread.sleep(10000);
			wd.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
			Thread.sleep(3000);
			wd.findElement(By.xpath("//a[text()='Sign out']")).click();
			
			Alert al=wd.switchTo().alert();
			al.accept();
			
			System.out.println("pass");
		}
		}
		
	}

}

//https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession

