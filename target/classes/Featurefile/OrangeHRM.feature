Feature: user login into OrangeHRM application

Scenario Outline: Registered user try to login into the application successfully
Given user hits the application URL
When user enters the username "<username>" and password "<password>"
And user hits the login button
Then user should see the login name as expected

Examples:
|username|password|
|Admin|admin123|