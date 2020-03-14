package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.generic.Createcompany;
import com.report.ExtentReport;




public class Key2ActCreateC extends ExtentReport  {
	WebDriver driver;

	@BeforeTest
	public void start() throws Throwable{
		Createcompany.intiazlization(driver);
		Createcompany.login();

	}
	@Test
	public void createcompany() throws InterruptedException {
		Createcompany.company() ;
	}
	@AfterTest (enabled = false)
	public void TearDown() {
		driver.quit();
	}

}
