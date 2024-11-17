Feature: Create User

  Background:
    * url apiUrl

  Scenario: User Created Successfully
    Given path 'api/v3/user'
    And request {"id":10,"username":"theUser","firstName":"John","lastName":"James","email":"john@email.com","password":"12345","phone":"12345","userStatus":1}
    When method POST
    Then status 200



