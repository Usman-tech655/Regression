package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.generic.ForgotPassword;


public class Forgotpwd   {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
		ForgotPassword.intiazlization(driver);
	}
	@Test
	public void password() throws Throwable {
		ForgotPassword.getForgotpwd();
	}
	

}
