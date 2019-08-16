@get
Feature: Testing GET API

  @smoke
  Scenario: Get all users
    Given End point is configured
    When I request all users
    Then I should get status code 200
    And I should get all users