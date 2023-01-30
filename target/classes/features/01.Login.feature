Feature: Login User

  Scenario: User Login valid
    When User go to Web Music Youtube
    And User click sign in button
    And User input username and password
    And User click button login
    Then User on dashboard page