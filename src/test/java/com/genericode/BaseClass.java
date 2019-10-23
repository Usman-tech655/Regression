package com.genericode;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop = new Properties();
	
	public void BrowserInvoke ()throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\UKarim\\eclipse-workspace\\Key1Act\\src\\main\\java\\Key2Actsource\\Key2Act.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(driver.getTitle());

	

}

}