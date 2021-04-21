Feature: Login to FaceBook - Story Card
  Description user input
  Scenario: Login to FB and Validate Welcome message
    Given user is on Facebook login page
    When user enters username and password
    And user clicks login button
    Then user validate welcome message

    When user create FB post
    Then user validates FB post

    * user logout to FB
    * close browser

  Scenario: Login to FB and Validate Welcome message
    Given user is on Facebook login page
    When user enters username and password
    And user clicks login button
    Then user validate welcome message
    * user logout to FB
    * close browser
    When user like FB post
    Then user verify FB Like post

  Scenario: Login to FB and Validate Welcome message
    Given user is on Facebook login page
    When user enters username and password
    And user clicks login button
    Then user validate welcome message
    * user logout to FB
    * close browser
    When user comments FB post
    Then user verify FB comments

  Scenario: Login to FB and Validate Welcome message
    Given user is on Facebook login page
    When user enters username and password
    And user clicks login button
    Then user validate welcome message
    * user logout to FB
    * close browser
    When user comments FB post
    Then user verify FB comments
