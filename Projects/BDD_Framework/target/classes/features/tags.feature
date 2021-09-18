Feature: Login Functionality

#Scenario: Check availability of all the login Form elmns
#Given Launch the application with valid URL
#Then check the availbility of all the elmns
 
@Smoke
Scenario: Check login Func with valid Cred.
Given Launch the application with valid URL


@Regression
Scenario: Check login Func with valid Cred.
When user enters "Admin" and "admin123"


@Smoke
Scenario: Check login Func with valid Cred.
And  click on Login button


@Smoke @Regression
Scenario: Check login Func with valid Cred.
Then user should be redirect to Home page


@Smoke @Sanity @Regression
Scenario: Check login Func with valid Cred.
Then user should be redirect to Home page