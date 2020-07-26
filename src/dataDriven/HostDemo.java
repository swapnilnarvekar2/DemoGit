package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HostDemo 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		FileInputStream file=new FileInputStream("C:\\Users\\SWAPNIL\\Desktop\\DataSet.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(file);
		XSSFSheet sh=wk.getSheet("Data");
		
		int num=sh.getLastRowNum();
		System.out.println("Last Row= "+num);
		
		try {
		for(int i=1;i<=num;i++)
		{
			String uname=sh.getRow(i).getCell(0).toString();
			String pwd=sh.getRow(i).getCell(1).toString();
			
			System.out.println(i+". "+uname+"  "+pwd);
			
			wd.get("https://in.000webhost.com/cpanel-login?from=panel");
			wd.findElement(By.xpath("//input[@type='email']")).sendKeys(uname);
			wd.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
			wd.findElement(By.xpath("//button[@type='submit']/span")).click();
			Thread.sleep(3000);	
			wd.findElement(By.xpath("//*[@id=\"header\"]/header/div[3]/ul/li[2]/a")).click();
			Thread.sleep(3000);	
			wd.findElement(By.xpath("//*[@id=\"header\"]/header/div[3]/ul/li[2]/ul/a/span")).click();
			System.out.println("Passed");
			}	{
				System.out.println(e.getMessage());
				System.out.println("Not passed");
			}
		}
	ttps://in.000webhost.com/cpanel-login?from=panel