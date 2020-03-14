package com.generic;

import org.openqa.selenium.WebDriver;

import com.key2act.PageObject.MasterPageFactory;
import com.key2act.qa.base.Key2ActBase;

public class Subscription extends Key2ActBase {
	
	
	public Subscription(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static WebDriver ManageUserSub() throws Throwable {
		Thread.sleep(5000);
		pf.getSubElsp().click();
		pf.getUnSubUser().click();
		
		return driver;
		
		
	} 
	public static WebDriver ManageClientsub() {
		pf.getClientSub().click();
		pf.getClientElp().click();
		pf.getClientUnSub().click();
		
		return driver;
	}

}
