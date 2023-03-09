Feature: Employees Page

  user story:
  As a user, I should be able to access to the Company page.

  Scenario: Verify users see the 7 modules in the Company page shown as design

    Given user is already logged in to The homepage
    When users click the Company module
    Then verify the users see flowing options:

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Company        |
      | Video.               |
      | Business News(RSS)   |
      | Career               |
