Feature: Landing functionality features

Background:
Given user opens the browser and navigate to facebook.com
When user see the facebook logo is displayed



Scenario Outline: user being able to click on forget password button and navigate to the verifying page
Then user provides <username> in email field
And user clicks on forget password button
And user can see Please enter your email or phone number to search for your account message
And user closes the browser


Examples:
|username           |
|User1@gmail.com|
|User2@gmail.com|



Scenario: user being able to click on create page button and navigate to the create page
Then user clicks on create page button
And user can see Create A Page text in the top left of the page
And user closes the browser


Scenario: user being able to click on show more languages button and select Eastern Europe
Then user clicks on  show more languages button from the footer of the landing page
And select Eastern Europe from Suggested Languages
And user can see Română language displayed
And user closes the browser


Scenario: user being able to select French language on the footer of landing page

  Then user select French button on the footer of the page
  And user land on French login page
  Then user closes the browser


  Scenario: user being able to click on Groups button on the footer of landing page and perform actions in the Groups page
    Then user clicks on Groups Button
    And user select letter L in Groups page
    And user see list of groups stating with letter L
    Then user closes the browser
















