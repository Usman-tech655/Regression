package com.generic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.key2act.qa.base.Key2ActBase;

public class ForgotPassword extends Key2ActBase {
	
	
	public static WebDriver getForgotpwd() {
		pf.getForgot().get(0).click();
		pf.getFrgtemail().get(0).sendKeys(prop.getProperty("forgotpassword"));
		pf.getFrgtemail().get(0).sendKeys(Keys.TAB);
		pf.getFrgtreset().get(0).click();
		return driver;
	}

}
