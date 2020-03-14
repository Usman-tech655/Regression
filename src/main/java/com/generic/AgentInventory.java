package com.generic;

import org.openqa.selenium.WebDriver;

import com.key2act.qa.base.Key2ActBase;

public class AgentInventory extends Key2ActBase {
	public AgentInventory(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver AgentInvertory() throws Throwable {
		 Thread.sleep(2000);
		 pf.getAgentellipsis().get(0).click();
		 Thread.sleep(5000);
		 pf.getManageA().get(0).click();
		 pf.getViewBas().click();
		 return driver;
	}
}
