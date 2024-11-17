Feature: Delete Order By Id

  Background:
    * url apiUrl

  Scenario: Order Deleted By Id Successfully
    Given path 'api/v3/store/order/10'
    When method DELETE
    Then status 200


