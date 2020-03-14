package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Insite.qa.util.ActionClass;
import com.key2act.qa.base.Key2ActBase;

public class IotHub extends Key2ActBase {
	 

	 public IotHub(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static WebDriver getIot() throws Throwable {
		 Thread.sleep(3000);
		
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
		  pf.getAgentellipsis().get(0).click();
		  pf.getAgentAssign().get(0).click();
		  return driver;
	  }
	 public static WebDriver getiotManage() throws Throwable {
		 //Thread.sleep(2000);
		 pf.getAgentellipsis().get(0).click();
		 //Thread.sleep(3000);
		 pf.getManageA().get(0).click();
		// pf.getRebootA().get(0).click();
		
		 
		 return driver;
	 }
	 
	 
	 public static WebDriver AgentAction() throws Throwable{
		 Thread.sleep(2000);
		 pf.getAgentellipsis().get(0).click();
		 Thread.sleep(5000);
		 pf.getManageA().get(0).click();
		 pf.getRebootA().get(0).click();
		 
		 return driver;
	 }
	 public static WebDriver AgentR() throws Throwable {
		 Thread.sleep(2000);
		 pf.getAgentellipsis().get(0).click();
		 Thread.sleep(5000);
		 pf.getManageA().get(0).click();
		 pf.getRestartA().get(0).click();
		 return driver;
	 }
	 public static WebDriver PingA() throws Throwable {
//		 pf.getAgentellipsis().get(0).click();
//		 Thread.sleep(5000);
//		 pf.getManageA().get(0).click();
		 pf.getPingA().get(0).click();
		 return driver;
	 }
	 public static WebDriver ReAgent() throws Throwable {
		 Thread.sleep(10000);
		 pf.getArename().get(0).click();
		 Thread.sleep(1000);
		 pf.getClosepop().get(0).click();
		return driver;
	 }
	 public static WebDriver TimeZone() throws Throwable {
		 Thread.sleep(10000);
		 pf.getUpDateTime().get(0).click();
		 pf.getATimezone().get(0).click();
		 Thread.sleep(10000);
		 pf.getATime().get(0).click();
		 //Thread.sleep(10000);)
		
		 pf.getTimeC().get(0).click();
		 return driver;
	 }
	 public static WebDriver Aasign() throws InterruptedException {
		//Need Proper Serial Number to Enable Save Button
		 pf.getAssign().get(0).click();
		 pf.getASerial().get(0).sendKeys(prop.getProperty("serialnum"));
		 Thread.sleep(1000);
		 pf.getCloseAssign().get(0).click();
		 
		 return driver;
	 }
	 public static WebDriver FReset() {
		 pf.getAFreset().get(0).click();
		 pf.getResetAgent().get(0).sendKeys("Reset");
		 pf.getConfirmR().get(0).click();
		 return driver;
	 }
	 public static WebDriver AgentDel() {
		 pf.getDeleteA().get(0).click();
		 pf.getWriteDel().get(0).sendKeys("DELETE");
		 pf.getConfirmDel().get(0).click();
		 return driver;
	 }
	
	
	
	
	
	
	
	
	
	

}
