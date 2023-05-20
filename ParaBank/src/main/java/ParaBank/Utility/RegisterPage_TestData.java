package ParaBank.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import commonMethods.ReadExcelData;

public class RegisterPage_TestData {
	
	@DataProvider
	public String[][] getdata() throws IOException
	{
		String path="F:\\Java\\SeleniumJar\\SeleniumPrograms\\Day3-Locators\\ParaBank\\src\\main\\resources\\RegisterPage_TestData\\TestData.xlsx";
		ReadExcelData testData=new ReadExcelData(path);
		int rowCount = testData.getRowCount("Registration");
		int cellCount = testData.getCellCount("Registration", 1);
		String data[][] =new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j] = testData.getCellData("Registration", i, j);
			}
		}
	
		return data;
	}
	
	

}
