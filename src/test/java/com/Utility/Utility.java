package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	

	public static void captureScreenshot(WebDriver driver, String screenshotName ) throws IOException {
		String screenshot = screenshotName+" "+new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss_SS").format(new Date());

		//SimpleDateFormat simpleDateFormate = new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss_SS").format(new Date());
		/*Date date = new Date();
		simpleDateFormate.format(date);*/
		
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(System.getProperty("user.dir")+"/Screenshots/"+screenshot+".png");
		FileUtils.copyFile(sourceFile, destinationFile);
		System.out.println("Screenshot taken");
	}

}
