Feature:  all login scenarios

  Scenario: to test the functionality of login button for valid input
    Given I am on login Page
    When I enter correct username and password
    And I click on Login button
    Then I should be on home page