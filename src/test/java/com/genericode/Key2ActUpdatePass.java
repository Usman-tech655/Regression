package com.genericode;




import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.UpdatePassword;




public class Key2ActUpdatePass extends UpdatePassword{
	WebDriver driver;
	
	 @BeforeTest
	 public void Setup() throws Throwable {
		 intiazlization(driver);
		 login();
	 }
	 @Test
	 public void updatepasswd() throws InterruptedException {
		getupdatepwd();
	 }
	 
	 

}
