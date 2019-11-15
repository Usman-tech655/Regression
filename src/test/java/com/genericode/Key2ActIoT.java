package com.genericode;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import com.generic.IotHub;

public class Key2ActIoT extends IotHub {
	
	
	public Key2ActIoT () {
		super();
	}
	
	@BeforeTest
	public void setup() throws Throwable {
		intiazlization();
		login();
		getmenu();
	}
	
	
	@Test
	public void IOT() throws Throwable {
		getIot();
		
		
	}
	@Test (dependsOnMethods = {"IOT"})
	public void Agent() throws Throwable {
		getAgent();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
