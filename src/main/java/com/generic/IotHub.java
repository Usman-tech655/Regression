package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.Insite.qa.util.TestUtil;
import com.key2act.qa.base.Key2ActBase;

public class IotHub extends Key2ActBase {
	 
	public  IotHub () {
		super();
		
	}
	 public static WebDriver getIot() {
		 pf.getIot().get(0).click();
		 pf.getIot1().get(0).click();
		
		
		 
		 return driver;
	 }
	 public static WebDriver getAgent() throws Throwable {
		 //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 pf.getIotNA().get(0).click();
		 Thread.sleep(3000);
		 pf.getCreateAgent().get(0).sendKeys(prop.getProperty("firstname"));
		 pf.getAserial().get(0).sendKeys(Keys.TAB);
		 pf.getASave().get(0).click();
		 return driver;
		 
	 }
	  public static WebDriver getAssing() throws Throwable {
		  Thread.sleep(30000);
		  pf.getAssignA().get(0).click();
		  pf.getAgentAssign().get(0).click();
		  return driver;
	  }
	 public static WebDriver getiotManage() throws Throwable {
		 Thread.sleep(20000);
		 pf.getAssignA().get(0).click();
		 Thread.sleep(30000);
		 pf.getManageA().get(0).click();
		 pf.getConfig().get(0).click();
		 
		 return driver;
	 }
	 
	
	
	
	
	
	
	
	
	
	

}
