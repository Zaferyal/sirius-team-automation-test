Feature: Employees Page

  user story:
  As a user, ı want to access my profile page.

  Scenario: Verify the users view all options on my profile page.
    Given user is already logged in to The homepage
    When users click the user profile
    Then verify the users see flowing 4 options:
      | General           |
      | Drive             |
      | Task              |
      | Calender          |
      | conversations     |


