Feature: Next Base Login feature

  User Story
  As a user, I should be able to log in to the NextBaseCRM.
  Accounts are: hr user, help desk user, marketing user

  Background: For all scenarios user is on the login page
    Given users go to the login page.


  Scenario Outline: Verify login with valid credentials
    Given user use username "<email>" and passcode "<password>"
    When user click the login button
    Then verify the user should be at the home page

    Examples:
      | email                         | password |
      | hr5@cybertekschool.com        | UserUser |
      | helpdesk5@cybertekschool.com  | UserUser |
      | marketing5@cybertekschool.com | UserUser |


  Scenario: User login with invalid credentials
    Given Users enter invalid emails or passwords
    When Clicks the Log In button
    Then the users see "Incorrect login or password" on the loginPage





