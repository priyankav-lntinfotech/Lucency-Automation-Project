@Users
Feature: Verify Users Module
  
 Scenario: Verify Users Module functionality
      Given User navigate to Users Module
      When User is on Users page
      Then User will click on Add User button
      Then User will fill user details
      Then Click on Save button
      And Edit the user
      Then Delete that user      