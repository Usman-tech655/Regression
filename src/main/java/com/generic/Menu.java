package com.generic;

import org.openqa.selenium.WebDriver;

import com.key2act.qa.base.Key2ActBase;

public class Menu extends Key2ActBase{
	public Menu () {
		super();
	}
	
	public WebDriver geteditjcompany() {
		pf.getEditcompanyy().get(0).click();
		pf.getEditjcompany().get(0).click();
		pf.getEditjcompanyname().get(0).sendKeys(prop.getProperty(""));
		pf.getEditjadd().get(0).sendKeys(prop.getProperty(""));
		pf.getEditjsave().get(0).click();
		return driver;
		
	}
	
	public WebDriver geteditbilling() {
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
	public WebDriver getmanageuser() {
		pf.getManageuser().get(0).click();
		pf.getInviteuser().get(0).click();
		pf.getInviteemail().get(0).sendKeys(prop.getProperty(" "));
		pf.getInviterole().get(0).click();
		pf.getRoleselect().get(0).click();
		pf.getCreateuser().get(0).click();
		
		
		return driver;
	}
	public WebDriver getmanagerole() {
		pf.getManagerol().get(0).click();
		pf.getRolechange().get(0).click();
		pf.getManageuserole().get(0).click();
		pf.getUnewrole().get(0).click();
		pf.getNewrolesave().get(0).click();
		return driver;
	}
	public WebDriver getdeletuser() {
		pf.getManagerol().get(0).click();
		pf.getRemoveuser().get(0).click();
		return driver;
	}
	public WebDriver getMrole() {
		pf.getUserole().get(0).click();
		pf.getCreaterole().get(0).click();
		pf.getRolename().get(0).sendKeys(prop.getProperty(" "));
		pf.getRoledes().get(0).sendKeys(prop.getProperty(" "));
		pf.getRolesave().get(0).click();
		return driver;
	}







}
