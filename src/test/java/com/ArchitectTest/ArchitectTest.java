package com.ArchitectTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.architect.ArchitectPage;
import com.key2act.qa.base.Key2ActBase;
import com.report.ExtentReport;

public class ArchitectTest extends ExtentReport  {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		
		Key2ActBase.login();
		Key2ActBase.getmenu();
		Key2ActBase.Architect();
		
	}
	@Test
	public void Entity() {
		ArchitectPage.NewEntity();
	}
	@Test (dependsOnMethods= {"Entity"})
	public void CreateClient() throws Throwable {
		ArchitectPage.Client();
		
		
	}
	@AfterTest (enabled= false)
	public void TearDown() throws Throwable {

		driver.quit();
	}

}
