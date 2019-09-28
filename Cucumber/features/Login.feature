Feature: Test FaceBook Login Page

  Scenario Outline: Test with valid credentials
    Given Open chrome browser and start application
    When I enter "<user>" and "<pass>"
    Then user should be able to login to application

    Examples: 
      | user  | pass     |
      | sajju | sajju123 |
     
