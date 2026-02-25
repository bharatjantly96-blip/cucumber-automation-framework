Feature: Create of new customer

  Background: 
    Given user opens the application
    And user enters the username as "mngr654937"
    And user enters the password as "dehAjAg"
    When user clicks on the login button
    Then user navigated to the homepage

  Scenario Outline: Create a new customer with all the details
    Given user is on the home page of the application
    And user clicks on the New Customer link
    And user enters the customer name as "<cust_name>"
    And user selects a gender
    And user enters a date of birth as "<dob>"
    And user enters address as "<address>"
    And user enters city name as "<city>"
    And user enters state as "<state>"
    And user enters pin as "<pin>"
    And user enters phone number as "<phone>"
    And user enters email as "<email>"
    When user clicks on the submit button
    Then user a new customer is created
    And user captures the cust_id

    Examples: 
      | cust_name | dob        | address | city      | state     | pin    | phone      | email          |
      | Sam       | 05-12-1997 | MG Road | Bangalore | Karnataka | 560016 | 8073055933 | test@gmail.com |
