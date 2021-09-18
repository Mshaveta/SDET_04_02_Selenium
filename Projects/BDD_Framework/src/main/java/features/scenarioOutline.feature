Feature: Login Functionality

Scenario Outline: Check login Func with valid Cred.
Given Launch the application with valid URL
When user enters "<username>" and "<password>"
And  click on Login button
Then user should be redirect to Home page

Examples:
|username| password|
|admin123|admin|
|Admin|admin|
|admin123|admin123|
|Admin|admin123|