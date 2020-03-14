package com.IoTHuB;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Insite.qa.util.ActionClass;
import com.Insite.qa.util.Screenshot;
import com.generic.IotHub;
import com.key2act.qa.base.Key2ActBase;
import com.report.ExtentReport;

public class AgentsAction extends ExtentReport{
	

	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		Key2ActBase.login();
		Key2ActBase.getmenu();
		//Screenshot.captureScreenShot(driver, "Menu");
		
	}
	@Test
	public void IOT () throws Throwable {
		IotHub.getIot();
	} 
	
	@Test (enabled=false)
	public void reboot() throws Throwable {
		IotHub.AgentAction();
	}
	@Test (dependsOnMethods= {"IOT"})
	public void restart() throws Throwable {
		IotHub.AgentR();
	}
	@Test(dependsOnMethods= {"restart"})
	public void ping() throws Throwable {
		
		IotHub.PingA();
	}
	@Test(dependsOnMethods= {"ping"})
	public void RenameA() throws Throwable {
		IotHub.ReAgent();
		
	}
	@Test (dependsOnMethods= {"RenameA"})
	public void AgentTime() throws Throwable {
		IotHub.TimeZone();
	}
	@Test(dependsOnMethods= {"AgentTime"})
	public void Aagents() throws Throwable {
		IotHub.Aasign();
	}
	@Test  (enabled=false)
	public void FactoryR() {
		IotHub.FReset();
	}
	@Test (enabled=false)
	public void DelAgnet() {
		IotHub.AgentDel();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
