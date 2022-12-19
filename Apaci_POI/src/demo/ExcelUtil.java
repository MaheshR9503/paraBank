package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtil {
	
	String path="F:\\Java\\logInData.xlsx";
	XSSFSheet sheet1 ;
	FileInputStream fi;
	String sheet="Demo";
	
	
	
	public XSSFSheet getSheet() throws IOException
	{
		fi=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		 sheet1 = wb.getSheet(sheet);
		
		 wb.close();
		 
		return sheet1;
	}
	
	public int rowCount() throws IOException
	{
		this.getSheet();
		int rowcount = sheet1.getPhysicalNumberOfRows();
		
		return rowcount;
	}
	
	public int cellCount() throws IOException
	{
		int colmns=0;
		this.getSheet();
		for(int i=0;i<this.rowCount();i++)
		{
			XSSFRow row = getSheet().getRow(i);
			colmns = row.getPhysicalNumberOfCells();
			
		}
		return colmns;
	}

	
}
