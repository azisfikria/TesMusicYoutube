Feature: Explore menu
  Scenario: New Release Menu
    When User on dashboard page
    And User click explore menu
    And User click new release button
    Then User can see new release song

  Scenario: Charts Menu
    When User on dashboard page
    And User click explore menu
    And User click charts menu
    Then User see top 100 music video

  Scenario: Mood and Genres Menu
    When User on dashboard page
    And User click explore menu
    And User click mood and genre
    Then User see list of mood and genre song
