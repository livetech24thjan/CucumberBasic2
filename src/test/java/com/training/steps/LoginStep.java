package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.LoginPage;
import com.training.page.UserDropdownPage;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseTest{
	
	//PageFactory pageFactory = new PageFactory();
	BasePage page=null;
	
	@Before
	public void setup() throws Exception{
		launchApplication();
	}

	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		//page = pageFactory.initialize(Page);
		if(pageName.equalsIgnoreCase("loginpage"))
		{
		page=new LoginPage();
		}
		else if(pageName.equalsIgnoreCase("loginpage"))
		{
		page=new UserDropdownPage();
		}
	}
	
	@When("User enters into Textbox {string} {string}")
	public void user_enters_into_textbox(String logicalName, String Value) {
		page.enterintoTextbox(logicalName, Value);
	}
	
	@Then("User clicks {string}")
	public void user_clicks(String logicalName) {
	    page.click(logicalName);
	}
	
	@When("User validates Dropdown {string} {string}")
	public void user_validates_dropdown(String logicalName, String listExpected) {
		page.validateText(logicalName, listExpected);
	}

	
	@Then("Validate ErrMsg {string} {string}")
	public void validate_err_msg(String logicalName, String msg) {
	    page.validateText(logicalName, msg);
	}
	
	@Given("ValidateTitle {string}")
	public void validate_title(String string) throws IOException, InterruptedException {
		page.validateTitle(string);
	}
	
	@Then("User checks a checkbox {string}")
	public void user_checks_a_checkbox(String logicalName) {
		page.click(logicalName);
	}

	@When("Validate Displayed Text {string} {string}")
	public void validate_displayed_Text(String logicalName, String text) {
		page.validateText(logicalName, text);
	}



	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png", scenario.getName());
		
		driver.close();
		driver = null;
	}


}
