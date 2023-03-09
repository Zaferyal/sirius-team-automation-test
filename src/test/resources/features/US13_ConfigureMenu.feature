Feature: Employees Page

  user story:
  As a user, I should be able to configure the menu.

  Scenario: Verify users can access to 6 options under the CONFIGURE MENU.

    Given user is already logged in to The homepage
    When users click the CONFIGURE MENU option
    Then Verify the users see flowing options:
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
