package com.key2act.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Insite.qa.util.TestUtil;

import com.key2act.PageObject.MasterPageFactory;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Key2ActBase {

	protected static WebDriver driver;
	protected static MasterPageFactory pf;
	protected static Properties prop = new Properties();



	public static  WebDriver intiazlization(WebDriver driver) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//		WebDriverManager.chromedriver().setup();
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriverManager.operadriver().setup();
		//		WebDriverManager.iedriver().setup();
		//		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		driver = new ChromeDriver();

		FileInputStream fis = new FileInputStream("./src/main/java/Key2Actsource/Key2Act.properties");
		prop.load(fis);

		pf = new MasterPageFactory(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		return driver;

	}
	public static WebDriver login() throws Throwable {
		pf.getEmail().get(0).sendKeys(prop.getProperty("email")); //email for .work
		pf.getPass().get(0).sendKeys(prop.getProperty("pass")); //pass for .work

		//pf.wait();

		pf.getPass().get(0).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		pf.getSingin().get(0).submit();
		return driver;
	}
	public static WebDriver getmenu() throws Throwable {
		Thread.sleep(30000);
		pf.getMenu().get(0).click();


		return driver;
	}
	public static WebDriver getAdmin() {
		pf.getAdmin().get(0).click();
		return driver;
	}

	public static WebDriver getSignO() {
		pf.getSignObar().get(0).click();
		pf.getSignout().get(0).click();

		return driver;
	}
	
}
