Feature: Login Scenario of Salesforce Application
@wipTC01a
Scenario: Login into saleforce TC01
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
When User enters into Textbox "Username" "hello@peppa.pig"
Then User enters into Textbox "Password" ""
And User clicks "login"
But Validate ErrMsg "Error" "Please enter your password."


Scenario: Login into saleforce TC02
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
When User enters into Textbox "Username" "hello@peppa.pig"
Then User enters into Textbox "Password" "Sales1Force"
And User clicks "login"
Given User is on "UserDropdownPage"
And ValidateTitle "homePageTitle"


Scenario: Login into saleforce TC03
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
When User enters into Textbox "Username" "hello@peppa.pig"
Then User enters into Textbox "Password" "Sales1Force"
Then User checks a checkbox "RememberMe"
And User clicks "login"
Given User is on "UserDropdownPage"
And ValidateTitle "homePageTitle"
When User clicks "UserNameDropdown"
When User clicks "Logout"
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
But Validate Displayed Text "DisplayedUsername" "hello@peppa.pig"


Scenario: Login into saleforce TC04a
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
And User clicks "ForgotPassword"
And ValidateTitle "ForgotPasswordPage"
When User enters into Textbox "UsernameToResetPassword" "hello@peppa.pig"
And User clicks "Continue"
And ValidateTitle "CheckYourEmail"
But Validate Displayed Text "EmailSent" "We’ve sent you an email with a link to finish resetting your password."


Scenario: Login into saleforce TC04b
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
When User enters into Textbox "Username" "123"
Then User enters into Textbox "Password" "22131"
And User clicks "login"
But Validate ErrMsg "Error" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
