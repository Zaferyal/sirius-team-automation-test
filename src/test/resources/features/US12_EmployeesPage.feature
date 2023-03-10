Feature: Employees Page

  user story:
  As a user, ı want to access the Employees page.

  Scenario: Verify the users view all modules in the T Employees page.
    Given user is already logged in to The homepage
    When users click the Employees module
    Then verify the users sees the options:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |








