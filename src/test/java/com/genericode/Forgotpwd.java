package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.generic.ForgotPassword;
import com.key2act.qa.base.Key2ActBase;

public class Forgotpwd  {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
	}
	@Test
	public void password() {
		 ForgotPassword.getForgotpwd();
	}
	

}
