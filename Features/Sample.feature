Feature:  all login scenarios

  Background: before scenario
    Given I open the browser
    And I maximize it

  @login @valid
  Scenario: to test the functionality of login button for valid input
    Given I am on login Page
  #  When I enter correct username and password
    When I enter username as "admin" and password as "admin"
    And I click on Login button
    Then I should be on home page

  @login @invalid
  Scenario: to test the functionality of login button for invalid input
    Given I am on login Page
    # When I enter incorrect username and password
    When I enter username as "xyz" and password as "abc"
    And I click on Login button
    Then I should get an error

  @login @blank
  Scenario: to test the functionality of login button for blank input
    Given I am on login Page
    # When I enter keep username and password blank
    When I enter username as "" and password as ""
    And I click on Login button
    Then I should get another error

    @userReg
    Scenario: to test the functionality of user registration page
      Given I am on user registration page
      When I enter below data
      | Amol | Ujagare | amol@gmail.com | 8998898 |
      And I click on submit button
      Then user should be added














