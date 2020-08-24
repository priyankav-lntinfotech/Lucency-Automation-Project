@Users
Feature: Verify Users Module
  
 Scenario: Verify Users Module functionality
      Given User navigate to Users Module
      When User is on Users page
      Then User will click on Add User button
      Then User will fill user details
      And Click on Save button
      Then Edit the user
      And Delete that user      