package com.Subscriptions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Subscription;
import com.key2act.qa.base.Key2ActBase;

public class ClientManageSubs {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		Key2ActBase.getmenu();
		Key2ActBase.Subscrip();
}
	@Test
	public void ManageClientsubs() {
		Subscription.ManageClientsub();
		
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	}


