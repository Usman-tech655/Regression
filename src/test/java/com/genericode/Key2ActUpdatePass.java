package com.genericode;




import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.UpdatePassword;
import com.report.ExtentReport;




public class Key2ActUpdatePass extends ExtentReport {
	WebDriver driver;
	
	 @BeforeTest
	 public void Setup() throws Throwable {
		 UpdatePassword.intiazlization(driver);
		 UpdatePassword.login();
	 }
	 @Test
	 public void updatepasswd() throws InterruptedException {
		 UpdatePassword.getupdatepwd();
	 }
	 
	 

}
