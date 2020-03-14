package com.IoTHuB;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.AgentInventory;
import com.generic.IotHub;
import com.key2act.qa.base.Key2ActBase;
import com.report.ExtentReport;

public class AgentInvent extends ExtentReport {
	WebDriver driver;
	@BeforeTest
	public void Setup() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		Key2ActBase.getmenu();
	}
	@Test
	public void IOT() throws Throwable {
		IotHub.getIot();
	} 
	@Test (dependsOnMethods= {"IOT"})
	public void BasInventory() throws Throwable {
		AgentInventory.AgentInvertory();
	}

}
