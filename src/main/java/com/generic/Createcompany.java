package com.generic;

import org.openqa.selenium.Keys;

import com.key2act.qa.base.Key2ActBase;

public class Createcompany extends Key2ActBase {
	public void company() throws InterruptedException {

		pf.getCompany().get(0).click();
		pf.getCname().get(0).sendKeys("QA HAVC");
		pf.ctr.get(0).click();
		pf.getType().get(0).click();
		pf.getType().get(0).sendKeys(Keys.TAB);
		pf.getAddress().get(0).sendKeys(prop.getProperty("address"));
		Thread.sleep(5000);
		pf.getAddress().get(0).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		pf.getCreate().get(0).click();

	}
}
