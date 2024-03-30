package com.training.base;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.training.utilities.CommonUtilities;

public class BasePage {

	WebDriver driver;
	CommonUtilities common = new CommonUtilities();

	HashMap<String, By> ObjectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void addObject(String logicalName, By by) {
		ObjectRepo.put(logicalName, by);
	}

	public void enterintoTextbox(String LogicalName, String Value) {
		WebElement element = getEelment(LogicalName);
		waitforElement(element);
		element.clear();
		element.sendKeys(Value);
	}
	
	private WebElement getEelment(String LogicalName) {
		By by = ObjectRepo.get(LogicalName);
		WebElement element = driver.findElement(by);
		return element; 
		
	}
	
	public void click(String logicalName) {
		WebElement element = getEelment(logicalName);
		waitforElement(element);
		element.click();
	}
	
	public void validateText(String logicalName, String textExpected) {
		WebElement element = getEelment(logicalName);
		waitforElement(element);
		String textActual = element.getText();
		System.out.println(textActual);
		System.out.println(textExpected);
		Assert.assertEquals(textActual, textExpected);
	}
	
	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void validateTitle(String pageTitle) throws IOException, InterruptedException {
		Thread.sleep(5000);
		String titleActual = driver.getTitle();
		String titleExpected = common.getProperty(pageTitle);
		Assert.assertEquals(titleActual, titleExpected);
	}


}
