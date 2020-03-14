package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Insite.qa.util.Screenshot;
import com.key2act.PageObject.MasterPageFactory;
import com.key2act.qa.base.Key2ActBase;


public class Singup extends Key2ActBase {

	public Singup() throws Throwable {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public static  WebDriver getsignup() throws InterruptedException {
		Thread.sleep(30000);

		pf.getSignup().get(0).click();
		pf.getSignupfirst().get(0).sendKeys(prop.getProperty("firstname"));
		pf.getSignuplast().get(0).sendKeys(prop.getProperty("lastname"));
		pf.getSignuphone().get(0).sendKeys(prop.getProperty("phone"));
		pf.getEmailsignup().get(0).sendKeys(prop.getProperty("signupemail"));
		pf.getPass().get(0).sendKeys(prop.getProperty("pass"));
		pf.getSignupconfirm().get(0).sendKeys(prop.getProperty("confirmpass"));
		pf.getSignupconfirm().get(0).sendKeys(Keys.TAB);
		Thread.sleep(20000);
		pf.getHitsignup().get(0).click();
		return driver;


	}

}
