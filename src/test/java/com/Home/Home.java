package com.Home;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.generic.Homee;
import com.key2act.qa.base.Key2ActBase;

public class Home {
	
	WebDriver driver;
	
	@Test
	public void Setup() throws Throwable {
		driver =Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		Homee.getmenu();
		Homee.Home();
	}
	@Test
	public void SubsCl() {
		Homee.Client();
	}
	
	@AfterTest (enabled=false)
	public void TearDown() {
		driver.quit();
	}

}
