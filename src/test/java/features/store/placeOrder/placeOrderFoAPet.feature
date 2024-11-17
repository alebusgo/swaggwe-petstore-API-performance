Feature: Place An Order For A Pet

  Background:
    * url apiUrl

  Scenario: Order For A Pet Placed Successfully
    Given path 'api/v3/store/order'
    And request {"id":10,"petId":198772,"quantity":7,"shipDate":"2024-11-16T04:18:42.357Z","status":"approved","complete":true}
    When method POST
    Then status 200



