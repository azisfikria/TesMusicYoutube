Feature: Search

  Scenario: User search singer
    When User on dashboard page
    And User click button search
    And User input singer
    And User click singer
    Then User on singer page