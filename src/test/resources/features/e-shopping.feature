Feature: Vodafone E-shopping

  Scenario: verify that user can add items to chart
    Given user is in home page
    When user clicks on first item
    Then user is redirected to the first item's page
    And user adds first item to chart
    Then back to home page
    And user clicks on second item
    Then user is redirected to the second item's page
    And user adds second item to chart
    Then back to home page
    And user enters the third item's name in the search bar "Apple Watch Series 9 GPS 45mm"
    Then user is redirected to the third item's page
    And user adds third item to chart
