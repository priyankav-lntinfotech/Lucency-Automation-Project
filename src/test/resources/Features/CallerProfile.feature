
@CallerProfile
Feature: This feature shows the sessions associated against an ANI. Also, user can add/edit caller profile variable to sessions.

Scenario: Search for ANI to get session and copy it
    Given Login and navigate to Caller Profile module
    When Enter ANI and click on Search button
    Then Verify the session details
    And  Copy Caller Profile 