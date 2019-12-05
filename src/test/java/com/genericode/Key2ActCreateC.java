package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Createcompany;
import com.key2act.qa.base.Key2ActBase;

    

public class Key2ActCreateC extends Createcompany {
	 WebDriver driver;
	@BeforeTest
	public void start() throws Throwable{
		intiazlization(driver);
		login();
		
	}
	@Test
	public void createcompany() throws InterruptedException {
		company() ;
	}
	@AfterTest (enabled = false)
	public void TearDown() {
		driver.quit();
	}

}
