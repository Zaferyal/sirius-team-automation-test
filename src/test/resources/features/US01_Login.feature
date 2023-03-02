Feature: Next Base Login feature

  User Story:
  As a user, I should be able to log in to the NextBaseCRM.
  Accounts are: hr user, help desk user, marketing user

  Background: For all scenarios user is on the login page of the NextBaseCRM

    Given User is on the login page of the NextBaseCRM


  Scenario: Successful login
    When Users enter valid emails "hr5@cybertekschool.com" and passwords "UserUser"
    And Clicks the Log In button
    Then the users log in successfully and launch the homepage

  Scenario: Successful login
    When Users enter valid emails "helpdesk5@cybertekschool.com" and passwords "UserUser"
    And Clicks the Log In button
    Then the users log in successfully and launch the homepage

  Scenario: Successful login
    When Users enter valid emails "marketing5@cybertekschool.com" and passwords "UserUser"
    And Clicks the Log In button
    Then the users log in successfully and launch the homepage


  Scenario: User login with invalid credentials
      When Users enter invalid emails or passwords
      And Clicks the Log In button
      Then the users see "Incorrect login or password" on the loginPage





