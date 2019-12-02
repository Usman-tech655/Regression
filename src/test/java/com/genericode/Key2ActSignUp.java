package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Singup;

public class Key2ActSignUp {

	WebDriver driver;
	@BeforeTest
	public void setup() throws Throwable {
		Singup.intiazlization(driver);
		
	}
	@Test
	public void signuppage() throws Throwable {
		Singup.getsignup();
	}

}
