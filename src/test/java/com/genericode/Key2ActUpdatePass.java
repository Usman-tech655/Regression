package com.genericode;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.UpdatePassword;




public class Key2ActUpdatePass{
	WebDriver driver;
	
	 @BeforeTest
	 public void Setup() throws Throwable {
		 UpdatePassword.intiazlization(driver);
		 UpdatePassword.login();
	 }
	 @Test
	 public void updatepasswd() {
		 UpdatePassword. getupdatepwd();
	 }
	

}
