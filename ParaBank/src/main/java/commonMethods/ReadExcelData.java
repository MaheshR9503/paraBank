package commonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheets;
	public XSSFRow rows;
	public XSSFCell colmn;
	public CellStyle cell;
	int rowCount;
	int cellCount;
	String path;
	
	public ReadExcelData(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheets=wb.getSheet(sheetName);
		rowCount=sheets.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
	}
	
	public int getCellCount(String sheetName, int rowNumber) throws IOException
	{
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheets=wb.getSheet(sheetName);
		rows = sheets.getRow(rowNumber);
		cellCount = rows.getLastCellNum();
		wb.close();
		fis.close();
		return cellCount;
	}
	
	public String getCellData(String sheetName, int rowNum, int cellNum) throws IOException
	{
		fis =new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheets=wb.getSheet(sheetName);
		rows=sheets.getRow(rowNum);
		colmn=rows.getCell(cellNum);
		
		DataFormatter formatter=new DataFormatter();
		
		String data;
		
		data=formatter.formatCellValue(colmn);
		wb.close();
		fis.close();
		return data;
	}

}
