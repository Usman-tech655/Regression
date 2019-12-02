package com.genericode;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.Insite.qa.util.TestUtil;
import com.generic.IotHub;
import com.key2act.qa.base.Key2ActBase;

@Listeners(ListenerTest.class)
public class Key2ActIoT  {

	WebDriver driver;
	

	@BeforeTest
	public void setup() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		Key2ActBase.getmenu();
		TestUtil.captureScreenShot(driver, "Menu");
		
	}


	@Test
	public void IOT() throws Throwable {
		IotHub.getIot();
	
	}
	@Test(enabled=false)// (dependsOnMethods = {"IOT"})
	public void Agent() throws Throwable {
		IotHub.getAgent();

	}
	/*@Test (dependsOnMethods = {"IOT"})
	public void Assing() throws Throwable {
		
		IotHub.getAssing();

		
	}*/
	@Test (dependsOnMethods = {"IOT"})
	public void ManageAgent() throws Throwable {
		IotHub.getiotManage();
		Key2ActBase.getSignO();
	}


















}
