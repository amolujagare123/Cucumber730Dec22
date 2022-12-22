Feature:  another  scenarios

  @subscription @blank
  Scenario Outline: to test the functionality of subscription button
    Given I am on subscription page
    When  I enter <name> , <phone> and <email>
    And I click on subscribe button
    Then user should be subscribe
    Examples:
      | name    | phone  | email             |
      | ajay    | 123456 | ajay@email.com    |
      | amol    | 234567 | amol@email.com    |
      | sachin  | 345678 | sachin@email.com  |
      | bhushan | 456789 | bhushan@email.com |
      | neha    | 567890 | neha@email.com    |