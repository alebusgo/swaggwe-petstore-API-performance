Feature: Find Order By Id

  Background:
    * url apiUrl

  Scenario: Order Found By Id Successfully
    Given path 'api/v3/store/order/10'
    When method GET
    Then status 200

