Feature: Find pet from store

  Scenario: Find pet by ID
    Given an id of a pet from store
    When I search the pet by id
    Then the correct pet is found

  Scenario: Finding a pet with a wrong HTTP method is not allowed
    Given an id of a pet from store
    When I search the pet by id using a method that is not allowed
    Then I receive a 400 HTTP error