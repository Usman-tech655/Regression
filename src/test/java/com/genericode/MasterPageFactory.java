package com.genericode;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement> email;
	@FindBy(xpath="//*[@id='password']")
	private List<WebElement> pass;
	@FindBy(xpath="//*[@class='AuthCore_buttonContainer__p3GQ0\']")
	private List <WebElement> singin;
	@FindBy(xpath="//*[text()='Create Company']")
	private List<WebElement>company;
	@FindBy(xpath="(//button[@type= 'button'])[1]")
	private List <WebElement> drop;
	@FindBy(xpath="//*[text()='Sign Out']")
	private List<WebElement>signout;
	

	
	
	
	
	
	
	
	
	//Getter
	
	
	public List<WebElement> getSignout() {
		return signout;
	}

	public List<WebElement> getEmail() {
		return email;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getSingin() {
		return singin;
	}
	
	
	
	
	public List<WebElement> getCompany() {
		return company;
	}

	public List<WebElement> getDrop() {
		return drop;
	}
	public void setSignout(List<WebElement> signout) {
		this.signout = signout;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
