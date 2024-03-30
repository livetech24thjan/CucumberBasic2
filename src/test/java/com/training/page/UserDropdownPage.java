package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserDropdownPage extends BasePage{
	
	static WebDriver driver;

	public UserDropdownPage() {
		super(driver=BaseTest.getDriver());
		// TODO Auto-generated constructor stub
		
		addObject("UserNameDropdown", By.id("userNavLabel"));
		addObject("Logout", By.xpath("//a[text()='Logout']"));
		addObject("UserMenuDropDownList", By.id("userNav-menuItems"));
	}

}
