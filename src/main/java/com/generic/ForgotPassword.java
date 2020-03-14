package com.generic;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Insite.qa.util.ActionClass;
import com.Insite.qa.util.Screenshot;
import com.key2act.PageObject.MasterPageFactory;
import com.key2act.qa.base.Key2ActBase;

public class ForgotPassword extends Key2ActBase {
	
	
	
	public ForgotPassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver getForgotpwd() throws Throwable {
		
		//Thread.sleep(30000);
		//creenshot.captureScreenShot(driver, "password", "ForgotPassword");
		pf.getForgot().get(0).click();
		pf.getFrgtemail().get(0).sendKeys(prop.getProperty("forgotpassword"));
		pf.getFrgtemail().get(0).sendKeys(Keys.TAB);
		pf.getFrgtreset().get(0).click();
		return driver;
	}

}
