package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver());
		
		addObject("Username", By.id("username"));
		addObject("Password", By.id("password"));
		addObject("login", By.id("Login"));
		addObject("Error", By.id("error"));
		addObject("RememberMe", By.id("rememberUn"));
		addObject("ForgotPassword", By.id("forgot_password_link"));
		addObject("UsernameToResetPassword", By.id("un"));
		addObject("Continue", By.id("continue"));
		addObject("EmailSent", By.xpath("//p[contains(text(),'sent you an email')]"));
		addObject("DisplayedUsername", By.id("idcard-identity"));
	}

}
