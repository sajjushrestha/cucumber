Feature: Test FaceBook Sign Up MAP Page

  Scenario: Test with FB Sign Up MAP
    Given Open chrome
    When we write firname and lasname
    |firstname|lastname|
    |sajju    |shrestha|
    |cheri   |guna|
    Then I should be able to signup