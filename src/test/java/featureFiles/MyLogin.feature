Feature: Login functionality for demo

  Scenario Outline: Validate login functionality with valid data
    Given user opens the application
    And user enters the username as "<username>"
    And user enters the password as "<password>"
    When user clicks on the login button
    Then user navigated to the homepage

    Examples: 
      | username   | password |
      | mngr654937 | dehAjAg  |
