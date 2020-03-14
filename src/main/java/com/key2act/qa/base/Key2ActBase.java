package com.key2act.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Insite.qa.util.ActionClass;
import com.Insite.qa.util.Highlighter;
import com.Insite.qa.util.Screenshot;

import com.key2act.PageObject.MasterPageFactory;

//import io.github.bonigarcia.wdm.WebDriverManager;



public class Key2ActBase {

	public Key2ActBase(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

	protected static WebDriver driver = null;
	protected static MasterPageFactory pf;
	protected static Properties prop = new Properties();

	
	public static  WebDriver intiazlization(WebDriver driver) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		
//			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
//			driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		//	WebDriverManager.chromedriver().setup();
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriverManager.operadriver().setup();
		//		WebDriverManager.iedriver().setup();
		//		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		

		FileInputStream fis = new FileInputStream("./src/main/java/Key2Actsource/Key2Act.properties");
		prop.load(fis);

		pf = new MasterPageFactory(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Screenshot.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Screenshot.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		return driver;

	}
	public static WebDriver login() throws Throwable {
		//Highlighter.color(driver, pf.getEmail().get(0));
		pf.getEmail().get(0).sendKeys(prop.getProperty("email")); //email for .work
		pf.getPass().get(0).sendKeys(prop.getProperty("pass")); //pass for .work

		//pf.wait();

		//pf.getPass().get(0).sendKeys(Keys.TAB);
		//Thread.sleep(3000);
		
		pf.getSingin().get(0).submit();
		return driver;
	}
	public static WebDriver getmenu() throws Throwable {
		Thread.sleep(30000);
		pf.getMenu().get(0).click();
		


		return driver;
	}
	public static WebDriver Architect() {
		pf.getArchitect().click();
		return driver;
	}
	public static WebDriver Subscrip() {
		pf.getSub().click();
		return driver;
	}
	public static WebDriver getAdmin() {
		pf.getAdmin().get(0).click();
		return driver;
	}

	public static WebDriver getSignO() throws Throwable {
		Thread.sleep(10000);
		pf.getSignObar().get(0).click();
		pf.getSignout().get(0).click();

		return driver;
	}
	
}
