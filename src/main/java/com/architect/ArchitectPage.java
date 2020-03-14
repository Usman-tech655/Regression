package com.architect;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Insite.qa.util.ActionClass;
import com.Insite.qa.util.Highlighter;
import com.key2act.qa.base.Key2ActBase;

public class ArchitectPage extends Key2ActBase{

	public ArchitectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	static JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	public static WebDriver NewEntity() {
		pf.getEntity().click();
		
		return driver;
	}
	
	
	
	public static WebDriver Client() throws Throwable {
		pf.getClient().click();
		pf.getCrtClient().sendKeys(prop.getProperty("clientname"));
		pf.getBusinessT().click();
		Thread.sleep(1000);
		pf.getSelectBusiness().click();
		pf.getSearchAdd().sendKeys(prop.getProperty("address"));
		Thread.sleep(1000);
		pf.getSelectaddres().sendKeys(Keys.ARROW_DOWN);
		pf.getSelectaddres().sendKeys(Keys.ENTER);
		
		pf.getSelectaddres().click();
		Thread.sleep(1000);
		pf.getClientSave().click();
		
		return driver;
		}
	public static WebDriver CreateSite() throws Throwable{
		pf.getSite().click();
		pf.getUsmansite().click();
		pf.getSitename().sendKeys(prop.getProperty("Sitename"));
		pf.getSiteType().click();
		System.out.println("driver=" + driver); 
		Thread.sleep(10000);
		pf.getSiteType1().click();
		pf.getSFoot().sendKeys(prop.getProperty("SquareFootage"));
		pf.getFuelTypes().click();
		pf.getSelectFT().click();
		Thread.sleep(10000);
		pf.getTab().click();
	
		
		
		return driver;
	}
	public static WebDriver CreateCampus() throws Throwable {
		pf.getSite().click();
		pf.getCampus().click();
		
		pf.getClName().click();
		Thread.sleep(10000);
		pf.getCleintName().click();
		pf.getCampusName().sendKeys(prop.getProperty("CampusName"));
		pf.getCampusSave().click();
		return driver;
	}
	public static WebDriver CreateEqp() throws InterruptedException {
		Thread.sleep(1000);
		pf.getClientDrp().click();
		Thread.sleep(10000);
		pf.getEqp().click();
		pf.getCreateEqp().click();
		pf.getClientNameDrp().click();
		pf.getSelectClnt().click();
		Thread.sleep(10000);
		pf.getSelectSite().click();
		
		pf.getSelectSiteName().click();
		pf.getGiveName().sendKeys(prop.getProperty("Equipment"));
		Thread.sleep(1000);
		pf.getEqpType().click();
		pf.getEqpTypeSelect().click();
		pf.getEqpSave().click();
		return driver;
		
	}
}
