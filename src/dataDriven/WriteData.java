package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData 
{

	public static void main(String[] args) throws Exception		
	{
		FileInputStream file=new FileInputStream("C:\\Users\\SWAPNIL\\Desktop\\DataSet.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(file);
		XSSFSheet sh=wk.getSheet("Data");
		int num=sh.getLastRowNum();
		
		for(int i=1;i<=num;i++)
		{
			sh.createRow(i).createCell(columnIndex)
		}
		
		FileOutputStream out=new FileOutputStream("C:\\Users\\SWAPNIL\\Desktop\\DataSet.xlsx");
		wk.write(out);
		
		
		
}
}