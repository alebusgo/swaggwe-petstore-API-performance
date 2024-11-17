Feature: Returns Pet Inventory By Status

  Background:
    * url apiUrl

  Scenario: Pet Inventory Returned By Status Successfully
    Given path 'api/v3/store/inventory'
    When method GET
    Then status 200