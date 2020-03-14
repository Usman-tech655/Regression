package com.generic;

import org.openqa.selenium.WebDriver;


import com.key2act.qa.base.Key2ActBase;

public class Homee extends Key2ActBase {
	
	public Homee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static WebDriver Home() {
		pf.getHome().get(0).click();
		return driver;
	}
	public static WebDriver Client() {
		pf.getSubclient().click();
		pf.getCheckBox().click();
		pf.getSmsBox().click();
		pf.getSubSave().click();
		
		return driver;
		
	}
	


}
