package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Createcompany;
import com.key2act.qa.base.Key2ActBase;

    

public class Key2ActCreateC  {
	 WebDriver driver;
	@BeforeTest
	public void start() throws Throwable{
		Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		
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
