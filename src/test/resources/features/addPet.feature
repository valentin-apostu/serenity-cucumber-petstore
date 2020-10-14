Feature: Add pet to store

  Scenario: Valid pet can be added to store
    Given a new pet
    When I add the pet to store
    Then the pet is added correctly

  Scenario: Adding a pet with a wrong HTTP method is not allowed
    Given a new pet
    When I add the pet to store using a method that is not allowed
    Then I receive a 405 HTTP error
    And the response has type 'unknown'

  Scenario: Pets without a name cannot be added to store (name is mandatory)
    Given a pet without a name
    When I add the pet to store
    Then I receive a 400 HTTP error

  Scenario: Pets without photos cannot be added to store (photos are mandatory)
    Given a pet without photos
    When I add the pet to store
    Then I receive a 400 HTTP error