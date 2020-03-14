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

public class Screenshot {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	static Date date =new Date();
	static DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");//yyyy_MM_dd_HH_mm_ss
	static DateFormat dateFormat2 = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	
	
	public static String captureScreenShot(WebDriver driver, String title ,String testName) {

		String path;
		try {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		path = System.getProperty("user.dir")+"/target/screenshots/"+dateFormat2.format(date)+"/"+testName+"/"+ title+"_"+dateFormat.format(date)+"_"+ source.getName();
		FileUtils.copyFile(source, new File(path));
		Thread.sleep(1000);
		}
		catch(Exception e) {
		path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;
		}
		public static void cleanFolder(String testName){
		        try {
		            File f = new File("./target/screenshots/"+dateFormat2.format(date)+"/"+testName+"/");
		            FileUtils.cleanDirectory(f); //clean out directory (this is optional -- but good know)
		            FileUtils.forceDelete(f); //delete directory
		            FileUtils.forceMkdir(f); //create directory
		            System.out.println("Cleaned folder location...>>>"+f);
		        } catch (Exception e) {
		            //e.printStackTrace();
		            System.out.println("Location does not exist...>>>");
		        }
		    }

		     }
	
	


