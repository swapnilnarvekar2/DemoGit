package keywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadOperation 
{
	public void readKeywords(WebDriver wd) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\SWAPNIL\\Desktop\\DataSet.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(file);
		
		XSSFSheet sh=wk.getSheet("Credentials");
		int row=sh.getLastRowNum();
		System.out.println("Rows Credentials sheet= "+row);
		
		XSSFSheet sh1=wk.getSheet("Keyword");
		int count=sh.getLastRowNum();
		System.out.println("Rows Keyword sheet= "+count);
		
		Operations op=new Operations();
		
		
			for(int i=1;i<=row;i++)
			{
				String uname=sh.getRow(i).getCell(0).toString();
				String upwd=sh.getRow(i).getCell(1).toString();
				
				System.out.println(uname+" "+upwd);
				try
				{
				for(int k=1;k<=count;k++)
				{
						String a=sh1.getRow(k).getCell(0).toString();
						
						if(a.equals("getURL"))
						{
							op.getURL(wd);
						}
						
						else if(a.equals("enterUsername"))
						{
							op.enterUserame(wd,uname);
						}
						
						else if(a.equals("enterPassword"))
						{
							op.enterPassword(wd,upwd);
						}
						
						else if(a.equals("enterLogin"))
						{
							op.enterLogin(wd);
						}
						
						else if(a.equals("enterLogout"))
						{
							op.enterLogout(wd);
							System.out.println("Successful Login");
						}
					}
				}
				catch(Exception e)
				{
					System.out.println("Invalid Credentials");
				}
			}
	}
}
