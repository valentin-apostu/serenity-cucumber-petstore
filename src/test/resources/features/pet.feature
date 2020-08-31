Feature: Test Feature

  Scenario: Add pet to store
  Given a new pet
  When I add the pet to store
  Then the pet is added correctly

  Scenario: Add pet to store using the wrong method
    Given a new pet
    When I add the pet to store using a method that is not allowed
    Then I receive a 405 HTTP error
    And the response has type 'unknown'