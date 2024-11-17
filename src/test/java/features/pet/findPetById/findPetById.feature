Feature: Find Pet By Id

  Background:
    * url apiUrl

  Scenario: Pet Found By Id Successfully
    Given path '/api/v3/pet/10'
    When method GET
    Then status 200



