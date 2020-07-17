@TestSession
Feature: Verify Test Session Module
  
 Scenario: Verufy the TestSession functionality
    Given User navigate to Developer Portal
    When click on Test Session
    Then click on Add Test Session button
    Then select Campaign and Expiration date
    Then select number
    Then add session data
    And click on Create button
    Then Edit the Test Session  
    Then Delete the created Test Session