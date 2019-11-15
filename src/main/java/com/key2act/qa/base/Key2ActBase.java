package com.key2act.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Insite.qa.util.TestUtil;
import com.key2act.PageObject.MasterPageFactory;

public class Key2ActBase {
	public Key2ActBase(){
		super();
		
	}
	protected WebDriver driver;
	protected MasterPageFactory pf;
	protected Properties prop = new Properties();
	
	public  void intiazlization() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		FileInputStream fis = new FileInputStream("./src/main/java/Key2Actsource/Key2Act.properties");
		prop.load(fis);
		driver = new ChromeDriver();
		pf = new MasterPageFactory(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		/*pf.getEmail().get(0).sendKeys(prop.getProperty("email"));
		pf.getPass().get(0).sendKeys(prop.getProperty("pass"));

		//pf.wait();

		pf.getPass().get(0).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		pf.getSingin().get(0).submit();*/
		
	}
	public static String captureScreenShot(WebDriver driver, String ScreenShotName) {

		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
		 String dateTime = dateFormat.format(date.getTime());
		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
		String destination=currentDir +"//Screen Shot//"+dateTime+"//" +ScreenShotName + ".png";
		try {
		FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {

		e.printStackTrace();
		}

		System.out.println("Screen shot taken");

		return destination;

		     }
	public WebDriver login() throws Throwable {
		pf.getEmail().get(0).sendKeys(prop.getProperty("email"));
		pf.getPass().get(0).sendKeys(prop.getProperty("pass"));

		//pf.wait();

		pf.getPass().get(0).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		pf.getSingin().get(0).submit();
		return driver;
	}
	public WebDriver getmenu() {
		pf.getMenu().get(0).click();
		
		
		return driver;
	}
	public WebDriver getAdmin() {
		pf.getAdmin().get(0).click();
		return driver;
	}

}
