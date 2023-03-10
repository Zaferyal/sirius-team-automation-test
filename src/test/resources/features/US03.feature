Feature: Logout Functionality
  Agile Story: As a user, I should be able to logout.

  @Logout
  Scenario: Users can log out from the app
    Given Users are on the homepage
    When Users click on the user profile name
    And Users select the Log Out option
    Then Users back to the login page