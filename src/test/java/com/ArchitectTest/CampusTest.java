package com.ArchitectTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.architect.ArchitectPage;
import com.key2act.qa.base.Key2ActBase;

public class CampusTest {
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Throwable {
		driver= Key2ActBase.intiazlization(driver);
		
		Key2ActBase.login();
		Key2ActBase.getmenu();
		Key2ActBase.Architect();
		
	}
	@Test
	public void ClientCampus() throws Throwable {
		ArchitectPage.CreateCampus();
	}

}
