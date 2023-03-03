Feature: Next Base Login feature

  User Story:
  As a user, I should be able to log in to the NextBaseCRM.
  Accounts are: hr user, help desk user, marketing user

  Background: For all scenarios user is on the login page

    Given User is on the login page


  Scenario Outline: Verify login with valid credentials
    When user use username "<email>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the home page

    Examples:
      | email                         | password |
      | hr5@cybertekschool.com        | UserUser |
      | helpdesk5@cybertekschool.com  | UserUser |
      | marketing5@cybertekschool.com | UserUser |


  Scenario: User login with invalid credentials
    When Users enter invalid emails or passwords
    And Clicks the Log In button
    Then the users see "Incorrect login or password" on the loginPage





