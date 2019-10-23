package com.genericode;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

  public class Login extends BaseClass{

	
	MasterPageFactory pf;
	
	@BeforeTest
	public void setup() throws Throwable {
		BrowserInvoke();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "insite";
		assertEquals(expectedTitle,actualTitle);
		//System.out.println(driver.getTitle());
		
		
		
	}
	
	@Test
	public void verifyLogin() throws InterruptedException {
		
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		pf.getEmail().get(0).sendKeys(prop.getProperty("email"));
		pf.getPass().get(0).sendKeys(prop.getProperty("pass"));
		
		Thread.sleep(5000);
		pf.getPass().get(0).sendKeys(Keys.TAB);
		pf.getSingin().get(0).submit();
		
		Thread.sleep(10000);
		
		pf.getCompany().get(0).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Screen Shot
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*pf.getDrop().get(0).click();
		Thread.sleep(5000);
		pf.getSignout().get(0).click();*/
		
		
		
		
		
	}
	
	@AfterTest

	public void TearDown() throws InterruptedException{
		Thread.sleep(4000);
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
