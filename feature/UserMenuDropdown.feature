Feature: User Menu Scenario of Salesforce Application

Scenario: User Menu Dropdown TC05
Given User is on "LoginPage"
And ValidateTitle "loginPageTitle"
When User enters into Textbox "Username" "fatimarq@gmail.com"
Then User enters into Textbox "Password" "fatima786"
And User clicks "login"
Given User is on "UserDropdownPage"
And ValidateTitle "homePageTitle"
When Validate Displayed Text "UserNameDropdown" "Fatima Qureshi"
And User clicks "UserNameDropdown"
And User validates Dropdown "UserMenuDropDownList" "My Profile\nMy Settings\nDeveloper Console\nSwitch to Lightning Experience\nLogout"
