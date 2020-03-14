package com.generic;

import org.openqa.selenium.WebDriver;

import com.key2act.qa.base.Key2ActBase;

public class Menu extends Key2ActBase{
	
	
	public Menu(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver geteditjcompany() throws Throwable {
		Thread.sleep(3000);
		pf.getEditcompanyy().get(0).click();
		pf.getEditjcompany().get(0).click();
		pf.getEditjcompanyname().get(0).sendKeys(prop.getProperty(""));
		pf.getEditjadd().get(0).sendKeys(prop.getProperty(""));
		pf.getEditjsave().get(0).click();
		return driver;
		
	}
	
	public static WebDriver geteditbilling() throws Throwable {
		Thread.sleep(3000);
		pf.getEditcompany().get(0).click();
		pf.getEditname().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditemail().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditphone().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditadd().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditcity().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditstate().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditzip().get(0).sendKeys(prop.getProperty(" "));
		pf.getEditsave().get(0).click();
		

		return driver;
	}
	public static WebDriver getmanageuser() throws InterruptedException {
		Thread.sleep(3000);
		pf.getManageuser().get(0).click();
		pf.getInviteuser().get(0).click();
		pf.getInviteemail().get(0).sendKeys(prop.getProperty(" "));
		pf.getInviterole().get(0).click();
		pf.getRoleselect().get(0).click();
		pf.getCreateuser().get(0).click();
		
		
		return driver;
	}
	public static WebDriver getmanagerole() throws Throwable {
		Thread.sleep(3000);
		pf.getManagerol().get(0).click();
		pf.getRolechange().get(0).click();
		pf.getManageuserole().get(0).click();
		pf.getUnewrole().get(0).click();
		pf.getNewrolesave().get(0).click();
		return driver;
	}
	public WebDriver getdeletuser() throws Throwable {
		Thread.sleep(3000);
		pf.getManagerol().get(0).click();
		pf.getRemoveuser().get(0).click();
		return driver;
	}
	public static WebDriver getMrole() throws Throwable {
		Thread.sleep(3000);
		pf.getUserole().get(0).click();
		pf.getCreaterole().get(0).click();
		pf.getRolename().get(0).sendKeys(prop.getProperty(" "));
		pf.getRoledes().get(0).sendKeys(prop.getProperty(" "));
		pf.getRolesave().get(0).click();
		return driver;
	}







}
