package com.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.Browser;

public class Screenshot extends Browser{
	
	public void takeScreenShot() throws IOException
	{
		Date d=new Date();
		
		String replace = d.toString().replace(" ", "-").replace(":", "-");
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(screenshotAs, new File("F:\\Java\\SeleniumJar\\SeleniumPrograms\\Day3-Locators\\SwagLab\\src\\test\\resources\\Screenshots"));
	}

}
