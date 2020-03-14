package com.genericode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.generic.Menu;
import com.report.ExtentReport;

public class Key2ActMenu extends ExtentReport {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws Throwable {
		Menu.intiazlization(driver);
		Menu.login();
		Menu.getmenu();
		Menu.getAdmin();	
	}
	
	@Test 
	public void EditCompanyView() throws Throwable {
		
		Menu.geteditjcompany();
	}
	/*@Test (enabled =false)
	public void editbilling() throws Throwable {
		Thread.sleep(3000);
		Menu.geteditbilling();
		
	}
	@Test (priority=2) (dependsOnMethods = {"IOT"})
	public void ManageUsers() {
		Menu.getmanageuser();
	}
	@Test 
	public void ManageRole() {
		Menu.getmanagerole();
	}
	@Test
	public void DelUser() {
		Menu.getdeletuser();
	}*/
	@Test (dependsOnMethods= {"EditCompanyView"})
	public void ManageRoles() throws Throwable {
		Thread.sleep(50000);
		Menu.getmanagerole();
	}
	
	
	
	
	/*@AfterTest
	public void teardown() {
		driver.quit();
	}*/

}
