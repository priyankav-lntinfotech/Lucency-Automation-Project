@TileManagement
Feature: Verify Tile Management Module
  
 Scenario: Verify the TestManagement functionality
    Given User navigate to Developer Portal
    When click on Coustomer Context Pop Header link
    Then select Tile Management option
    And Create Single Variable Context Tile
    Then Edit the Tile
    Then Create Multi Variable Context Tile    
    And Delete the tile