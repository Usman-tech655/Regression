package com.IoTHuB;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Insite.qa.util.Screenshot;
import com.generic.IotHub;
import com.key2act.qa.base.Key2ActBase;


public class Key2ActIoT  {

	WebDriver driver;
	

	@BeforeTest
	public void setup() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		Key2ActBase.getmenu();
		//Screenshot.captureScreenShot(driver, "Menu");
		
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
	@Test (enabled =false)
	public void ManageAgent() throws Throwable {
		IotHub.getiotManage();
		//Key2ActBase.getSignO();
	}

	


















}
