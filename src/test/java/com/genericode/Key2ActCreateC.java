package com.genericode;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.generic.Createcompany;




public class Key2ActCreateC extends Createcompany {

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
