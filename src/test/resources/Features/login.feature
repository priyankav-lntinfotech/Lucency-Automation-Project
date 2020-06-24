Feature: Login Feature
  This feature deals with the login functionality of Lucency Application

 Scenario: Login with correct username and password
  Given Open Lucency site and navigate to login page
 When I enter email and password
 And I click on login button
Then I should see the Home page

 Scenario: Check Login with incorrect parameters
  Given Open Lucency site and navigate to login page
  When I enter email as "aj-agent@yopmail.com" and password as "Pass@12345"
  And I click on login button
  Then I should see the Login page with error message

