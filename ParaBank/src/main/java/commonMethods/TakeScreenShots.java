package commonMethods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePackage.BaseClass;


public class TakeScreenShots extends BaseClass {
	
	
	public void getScreenShots() throws IOException {
		
		Date today=new Date();
		
		String todayDate = today.toString().replace(" ", "-").replace(" ", "-");
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("F:\\Java\\SeleniumJar\\SeleniumPrograms\\Day3-Locators\\ParaBank\\ScreenShots"));
		
		
	}
	

}
