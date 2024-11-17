Feature: Add New Pet To The Store

  Background:
    * url apiUrl

  Scenario: New Pet Added to the Store Successfully
    Given path '/api/v3/pet'
    And request {"id":10,"name":"doggie","category":{"id":1,"name":"Dogs"},"photoUrls":["string"],"tags":[{"id":0,"name":"string"}],"status":"available"}
    When method PUT
    Then status 200


