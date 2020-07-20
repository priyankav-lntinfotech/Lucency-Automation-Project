
@UserProfile
Feature: Title of your feature
  I want to use this template for my feature file

Scenario: To verify user details are saved and can upload Profile photo
    Given Login with an user and navigate to My Account Settings page
  	When Click on Edit icon to update user details, password, profile pic
  	Then update user details
  	And  update password
   	And  upload Profile picture
