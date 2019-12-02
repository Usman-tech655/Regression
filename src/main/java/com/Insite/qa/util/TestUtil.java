package com.Insite.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtil {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static String captureScreenShot(WebDriver driver, String ScreenShotName) {

		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");//yyyy_MM_dd_HH_mm_ss
		Date date = new Date();
		 String dateTime = dateFormat.format(date.getTime());
		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
		String destination=currentDir +"//Screen Shot//"+dateTime+"//" +ScreenShotName + ".png";
		try {
		FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {

		e.printStackTrace();
		}

		System.out.println("Screen shot taken");

		return destination;

		     }
	public static void color(WebDriver driver, WebElement element) {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].style.border='3px solid green");
	
	}
	

}
