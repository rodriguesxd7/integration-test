Feature: CRUD user Impacta

  Scenario: Simple Get with all users
    Given user is on the Agapito servers page
    When user clicks on find Agapitos button
    Then user should see "success" message

  Scenario: Simple Get with one users
    Given user is on the Agapito servers page
    And user would like to see user with id
    When user clicks on find Agapitos button
    Then user should see "success" message