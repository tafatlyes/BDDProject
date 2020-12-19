Feature: login functionality features

  Background:
    Given user opens the browser and navigate to facebook.com
    When user see the facebook logo is displayed


    #@Smoke
  Scenario Outline: user not being able to login using invalid credentials
    Then user provides <username> and <password> in the desired field
    Then user clicks on the login button
    And user can see error message
    And user closes the browser


    #we use Examples when we use parameterization
    Examples:
    |username           | password   |
    |testuser1@gmail.com| 1234abc    |
    |testuser2@gmail.com| 1234abc    |
    |testuser3@gmail.com| 1234abc    |





  Scenario: user being able to click on login button from the footer of the landing page
    Then user clicks on the login button from the footer
    And user can see the login page is displayed
    Then user closes the browser





