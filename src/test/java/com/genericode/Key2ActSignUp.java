package com.genericode;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Singup;

public class Key2ActSignUp extends Singup {

	public Key2ActSignUp() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	@BeforeTest
	public void setup() throws Throwable {
		intiazlization(driver);
		
	}
	@Test
	public void signuppage() throws Throwable {
		getsignup();
	}

}
