Feature: Find User By Name

  Background:
    * url apiUrl

  Scenario: User Found By Name Successfully
    Given path 'api/v3/user/theUser'
    When method GET
    Then status 200


