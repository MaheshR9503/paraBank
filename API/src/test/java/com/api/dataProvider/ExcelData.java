package com.api.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	String path="F:\\Testing pdf\\API\\dataProvider.xlsx";
	FileInputStream fi;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow rows;
	int row;
	int cellCount;
	XSSFCell cols;
	
	@DataProvider
	public String[][] getData()
	{
		String s[][]=new String[7][2];
		
		try {
			fi=new FileInputStream(path);
			wb=new XSSFWorkbook(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			sheet=wb.getSheetAt(0);
			row = sheet.getPhysicalNumberOfRows();
			
			cellCount=rows.getPhysicalNumberOfCells();
		
		for(int i=1;i<=row;i++)
		{
			rows=sheet.getRow(i);
			for(int j=0;j<cellCount;j++) 
			{
				cols = rows.getCell(j);
				
				DataFormatter d=new DataFormatter();
				String value = d.formatCellValue(cols);
				s[i-1][j]=value;
			}
		}
		
		return s;
	}

}
