package com.Insite.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	
	public static void color(WebDriver driver, String xpath) {
		WebElement element_node = driver.findElement(By.xpath(xpath));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid green" , element_node);
		
		}

	public static void color(WebDriver driver, WebElement webElement) {
		// TODO Auto-generated method stub
		WebElement element_node = webElement;
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid green" , element_node);
	}

}
