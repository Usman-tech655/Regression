package com.genericode;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.UpdatePassword;

public class Key2ActUpdatePass extends UpdatePassword{
	
	public Key2ActUpdatePass () {
		super();
	}
	 @BeforeTest
	 public void Setup() throws Throwable {
		 intiazlization();
			login();
	 }
	 @Test
	 public void updatepasswd() {
		 getupdatepwd();
	 }
	

}
