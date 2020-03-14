package com.generic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.key2act.qa.base.Key2ActBase;

public class UpdatePassword extends Key2ActBase{
	 
	
	public UpdatePassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver getupdatepwd() throws InterruptedException {
		Thread.sleep(20000);
		pf.getChange().get(0).click();
		pf.getUpdate().get(0).sendKeys(prop.getProperty("old"));
		Thread.sleep(20000);
		pf.getUpdate().get(0).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		pf.getUpdate().get(0).sendKeys(Keys.BACK_SPACE);
		pf.getUpdate().get(0).sendKeys(prop.getProperty("old"));
		pf.getNewpass().get(0).sendKeys(prop.getProperty("new"));
		Thread.sleep(20000);
		
		
		pf.getCreate1().get(0).click();
		return driver;
		
	}
	
	

}
