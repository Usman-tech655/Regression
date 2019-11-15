package com.genericode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Menu;

public class Key2ActMenu extends Menu{

	public Key2ActMenu() throws Throwable {
		super();
		
	}
	@BeforeTest 
	public void Setup() throws Throwable {
		intiazlization();
		login();
		getmenu();
		getAdmin();
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Screen Shot
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Test 
	public void EditCompanyView() throws Throwable {
		Thread.sleep(3000);
		geteditjcompany();
	}
	/*@Test (enabled =false)
	public void editbilling() throws Throwable {
		Thread.sleep(3000);
		geteditbilling();
		
	}
	@Test (priority=2) (dependsOnMethods = {"IOT"})
	public void ManageUsers() {
		getmanageuser();
	}
	@Test 
	public void ManageRole() {
		getmanagerole();
	}
	@Test
	public void DelUser() {
		getdeletuser();
	}*/
	@Test 
	public void ManageRoles() throws Throwable {
		Thread.sleep(50000);
		getMrole();
	}
	
	
	
	
	/*@AfterTest
	public void teardown() {
		driver.quit();
	}*/

}
