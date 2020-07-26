package testNGPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven {
	
	@Test
	public void readData() throws FileNotFoundException {
		
		
		FileInputStream in=new FileInputStream("C:\\Users\\SWAPNIL\\Desktop\\DataSet.xlsx");
		
		
		try {
			
			XSSFWorkbook wk = new XSSFWorkbook(in);
			
			XSSFSheet sh=wk.getSheet("Credentials");
			
			int row=sh.getLastRowNum();
			
			for(int i=1;i<=row;i++)
			{
				String uname="a",pwd="b";
				
				 uname=sh.getRow(i).getCell(0).toString();
				
				 pwd=sh.getRow(i).getCell(1).toString(); 
				
				System.out.println(uname+" "+pwd);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		
		
	}

}
