Feature: Login Functionality

#Scenario: Check availability of all the login Form elmns
#Given Launch the application with valid URL
#Then check the availbility of all the elmns
 
Background:
Given Launch the application with valid URL

Scenario: Check login Func with valid Cred.
When user enters "Admin" and "admin123"
And  click on Login button
Then user should be redirect to Home page

Scenario: Check login Func with valid Cred.
When user enters "admin123" and "admin123"
And  click on Login button
Then user should be redirect to Home page


Scenario: Check login Func with valid Cred.
When user enters "admin" and "admin"
And  click on Login button
Then user should be redirect to Home page
