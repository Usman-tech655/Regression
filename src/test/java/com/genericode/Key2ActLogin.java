package com.genericode;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.generic.Singup;

//import com.key2act.BaseProperties.BaseClass;
import com.key2act.PageObject.MasterPageFactory;
import com.key2act.qa.base.Key2ActBase;

public class Key2ActLogin extends Key2ActBase{




	public Key2ActLogin() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void setup() throws Throwable {

		intiazlization();
		



	}
	


	@Test
	public void verifyLogin() throws InterruptedException {

		pf = new MasterPageFactory(driver);
		

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Screen Shot
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Roles
		Thread.sleep(3000);
		pf.getMenu().get(0).click();
		Thread.sleep(3000);
		pf.getAdmin().get(0).click();
		//Thread.sleep(4000);
		pf.getManageuser().get(0).click();
		Thread.sleep(3000);
		pf.getManagerol().get(0).click();
		/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pf.getRolechange().get(0).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pf.getRemoveuser().get(0).click();
		pf.getManageuserole().get(0).click();
		pf.getUnewrole().get(0).click();
		Thread.sleep(3000);
		pf.getNewrolesave().get(0).click();
		
		
		
		
		


		
		
		


	}


	@Test (enabled =false)// (dependsOnMethods= {"verifyLogin"}) 
	public void company() throws InterruptedException {

		pf.getCompany().get(0).click();
		pf.getCname().get(0).sendKeys("QA HAVC");
		pf.ctr.get(0).click();
		pf.getType().get(0).click();
		pf.getType().get(0).sendKeys(Keys.TAB);
		pf.getAddress().get(0).sendKeys(prop.getProperty("address"));
		Thread.sleep(5000);
		pf.getAddress().get(0).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		pf.getCreate().get(0).click();

	}
	

	@Test (enabled = false) //(dependsOnMethods = {"UpdatePass"})
	public void ApplicationMenu() {

		pf.Wait();
		pf.getCreate1().get(0).click();
	}
	@Test (enabled = false)//(dependsOnMethods = {"ApplicationMenu"})
	public void Billing() {
		pf.Wait();
		pf.getBilling().get(0).sendKeys(prop.getProperty("billing"));
		pf.getBillingemail().get(0).sendKeys(prop.getProperty("billemail"));
		pf.getBillingphone().get(0).sendKeys(prop.getProperty("phone"));
		pf.getBillingadd().get(0).sendKeys(prop.getProperty("billingad"));
		pf.getCity().get(0).sendKeys(prop.getProperty("billingcity"));
		pf.getBillingstate().get(0).sendKeys(prop.getProperty("billingstate"));
		pf.getBillingzip().get(0).sendKeys(prop.getProperty("billingzip"));
		pf.getBillingsave().get(0).click();
	}
	@Test (enabled =false) //(dependsOnMethods={"Billing"})
	public void Logout() throws InterruptedException{

		/*pf.getDrop().get(0).click();

		pf.getSignout().get(0).click();*/

	}
	@AfterTest (enabled = false)

	public void TearDown() throws InterruptedException{

		driver.quit();
	}






















}
