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

public class Key2ActMenu extends Menu {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws Throwable {
		intiazlization(driver);
		login();
		getmenu();
		getAdmin();	
	}
	
	@Test 
	public void EditCompanyView() throws Throwable {
		
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
	@Test (dependsOnMethods= {"EditCompanyView"})
	public void ManageRoles() throws Throwable {
		Thread.sleep(50000);
		getmanagerole();
	}
	
	
	
	
	/*@AfterTest
	public void teardown() {
		driver.quit();
	}*/

}
