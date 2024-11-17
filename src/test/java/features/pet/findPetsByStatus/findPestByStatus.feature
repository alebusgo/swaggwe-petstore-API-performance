Feature: Finds Pets By Status

  Background:
    * url apiUrl

  Scenario: Pets Found By Status Successfully
    * def query = {status:'available'}
    Given path 'api/v3/pet/findByStatus'
    And params query
    When method get
    Then status 200

  