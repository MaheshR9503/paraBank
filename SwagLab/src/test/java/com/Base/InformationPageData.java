package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class InformationPageData {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheetAt;
	XSSFRow row;
	String path="F:\\Java\\SeleniumJar\\SeleniumPrograms\\Day3-Locators\\SwagLab\\src\\test\\resources\\DataForInformationPage\\InfomationData.xlsx";
	
	public XSSFSheet workBook()
	{
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		sheetAt = wb.getSheetAt(0);
		return sheetAt;
	}
	
	
	public int getRoCount()
	{
		
		workBook();
		
		int rows = sheetAt.getPhysicalNumberOfRows();
		
		return rows;
	}
	
	public int getCellNumber()
	{
		workBook();
		int columns=0;
		
		for(int i=0;i<getRoCount();i++)
		{
			 row = sheetAt.getRow(i);
			 columns = row.getPhysicalNumberOfCells();
		}
		
		return columns;
	}
	
	
	
	@DataProvider
	public String[][] getData()
	{
		String[][] s=new String[this.getRoCount()-1][this.getCellNumber()];
	
		for(int i=1;i<getRoCount()-1;i++)
		{
			XSSFCell cell = row.getCell(i);
			for(int j=0;j<getCellNumber();j++)
			{
			 String value = cell.getStringCellValue();
			
			 s[getRoCount()][getCellNumber()]=value;
			
			}
		}

		return s;
	}

}
