@Authentication
Feature: Verify Authentication Module
  
 Scenario: Verify the Authentication Module functionality
    Given User landed on Developer Portal
    When User click on Agent Pop side menu
    Then click on Authentication
    Then click on Add Address   
    Then add IP Address and Label
    And click on Save 
    Then Edit IP Address
    Then Delete the IP Address