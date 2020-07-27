@UserProfile
Feature: Title of your feature
  I want to use this template for my feature file

Scenario: To verify user details are saved and can upload Profile photo
    Given Login with an user and navigate to My Account Settings page
  	When User click on Edit icon to update User details Password and Profile Pic
  	Then User update the user details
  	Then User update the password
   	And  Upload the Profile picture