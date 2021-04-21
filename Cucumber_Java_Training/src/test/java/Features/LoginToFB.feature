Feature: Login to FaceBook - Story Card
  Description user input
  Scenario: Login to FB and Validate Welcome message
    Given user is on Facebook login page
    When user enters username and password
    And user clicks login button
    Then user validate welcome message
    * user logout to FB 1
    * close browser
