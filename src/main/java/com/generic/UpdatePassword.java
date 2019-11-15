package com.generic;

import org.openqa.selenium.WebDriver;

import com.key2act.qa.base.Key2ActBase;

public class UpdatePassword extends Key2ActBase{
	 
	public UpdatePassword() {
		super();
	}
	
	public WebDriver getupdatepwd() {
		pf.getChange().get(0).click();
		pf.getUpdate().get(0).sendKeys(prop.getProperty("old"));
		pf.getNewpass().get(0).sendKeys(prop.getProperty("new"));
		pf.getCreate1().get(0).click();
		return driver;
		
	}
	
	

}
